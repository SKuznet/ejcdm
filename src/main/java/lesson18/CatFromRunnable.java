package lesson18;

import java.util.concurrent.TimeUnit;

public class CatFromRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(100);
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is: " + Thread.currentThread().getName());
        System.out.println("Hello from cat from another thread with runnable!");
    }
}
