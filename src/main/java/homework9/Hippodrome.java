package homework9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Hippodrome {
    private static final int FINISH_LINE = 800;
    private List<Horse> horses = new ArrayList<>();
    private ExecutorService service = Executors.newCachedThreadPool();
    private CyclicBarrier cyclicBarrier;


    public Hippodrome(int nHorses, int pause, Player player) {
        Names[] names = Names.values();

        cyclicBarrier = new CyclicBarrier(nHorses, () -> {
            for (Horse horse: horses) {
                if (horse.getStrides() >= FINISH_LINE){
                    System.out.println(horse + " is won!");
                    if(player.getFavorite() == horse.getName()){
                        player.setMoney(player.getMoney() + player.getBet());
                        System.out.println("Congratulations! You got " + player.getBet() + " money!");
                    } else {
                        player.setMoney(player.getMoney() - player.getBet());
                        System.out.println("You lost :(");
                    }
                    service.shutdownNow();
                    return;
                }
            }

            try {
                TimeUnit.MILLISECONDS.sleep(pause);
            } catch (InterruptedException e) {
                System.err.println("Barrier action: sleep interrupted");
            }
        });

        for (int i = 0; i < nHorses; i++) {
            Horse horse = new Horse(cyclicBarrier, names[i].name());
            horses.add(horse);
            service.execute(horse);
        }
    }
}
