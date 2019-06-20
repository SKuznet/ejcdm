package lesson18;

import java.util.concurrent.TimeUnit;

public class SimpleDaemonExample implements Runnable {
    @Override
    public void run() {
        try{
            while (true) {
                System.err.println(Thread.currentThread() + " " + this);
                TimeUnit.DAYS.sleep(1);
            }
        } catch (InterruptedException e) {
            System.err.println("sleep() interrupted");
        } finally {
            System.err.println("AAAAA");
        }

    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemonExample());
            daemon.setDaemon(true);
            daemon.start();
        }

        System.out.println("all daemons is ran");

        try {
            TimeUnit.MILLISECONDS.sleep(175);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
