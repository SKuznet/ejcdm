package lesson20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am from another thread!");
            }
        });
        thread.start();

//        ExecutorService service = Executors.newCachedThreadPool();
//        for (int i = 0; i < 10; i++) {
//            service.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.err.println("from another thread!");
//                }
//            });
//        }

//        service.shutdown();

//        ExecutorService service1 = Executors.newFixedThreadPool(2);
//        for (int i = 0; i < 10; i++) {
//            service1.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.err.println("new thread from fixed pool");
//                    try {
//                        TimeUnit.MILLISECONDS.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }

        ExecutorService service2 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            service2.submit(new Runnable() {
                @Override
                public void run() {
                    System.err.println("I am single new thread!");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        service2.shutdown();
    }
}
