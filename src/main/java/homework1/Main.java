package homework1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        new Main().helloFromAnotherThread();
        new Main().helloFromAnotherThread();
        new Main().helloFromAnotherThread();
    }

    private void helloFromAnotherThread() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
        executorService.shutdown();
    }
}
