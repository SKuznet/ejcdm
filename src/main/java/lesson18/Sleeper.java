package lesson18;

public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        this.duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.err.println(getName() + " interrupted, isInterrupted " + interrupted());
            return;
        }

        System.out.println(getName() + " activated");
    }
}
