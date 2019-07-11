package task09;

public class Barrier extends CreateHorse implements Runnable {
    @Override
    public void run() {
        System.out.println("barrier reached");
    }
}

