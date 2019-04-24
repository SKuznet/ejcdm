package lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from " + Thread.currentThread().getName());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from another " + Thread.currentThread().getName());
            }
        }).start();

    }
}
