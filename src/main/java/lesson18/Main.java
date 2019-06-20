package lesson18;

public class Main {
    public static void main(String[] args) {
        CatFromAnotherThread cat = new CatFromAnotherThread();
        Thread thread = new Thread(new CatFromRunnable());
        thread.start();
        cat.start();
        System.out.println("Thread is: " + Thread.currentThread().getName());

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from another anonymous runnable");
            }
        });
        thread1.start();
    }
}
