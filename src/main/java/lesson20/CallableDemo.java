package lesson20;

import java.util.ArrayList;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ArrayList<Future> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(service.submit(new TaskResult(i)));
        }

        for (Future<String> fs: list) {
            try {
                    System.out.println(fs.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } finally {
                service.shutdown();
            }
        }
    }
}
