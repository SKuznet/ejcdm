package task09;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Horse extends CreateHorse implements Runnable {
    private int id;
    private int maxSpeed;
    private String name;

    Horse(int id, String name, int maxSpeed) {
        this.id = id;
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return id == horse.id &&
                maxSpeed == horse.maxSpeed &&
                Objects.equals(name, horse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maxSpeed, name);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "id=" + id +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                '}';
    }

    private CyclicBarrier bar;

    Horse(CyclicBarrier c, String n) {
        bar = c;
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        //Calculating data during the race and record in List
        List<Integer> dataHorseInTheRun = new ArrayList<>();
        int dataOneRun = 0;
        for (int i = 0; i < 5; i++) {
            dataHorseInTheRun.add(factoryHorse().get(bar.getNumberWaiting()).getMaxSpeed()
                    - 20 + new Random().nextInt(30));
            dataOneRun = dataOneRun + dataHorseInTheRun.get(i);
        }
        DataCyclicBarrier.dataHorseInTheRun.add(dataHorseInTheRun);
        DataCyclicBarrier.dataHorseInTheFinish.add(dataOneRun);

        try {
            bar.await();
        } catch (BrokenBarrierException | InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}
