package lesson18;

public class CatFromAnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is: " + Thread.currentThread().getName());
        System.out.println("Hello from cat from another thread!");
    }
}
