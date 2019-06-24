package lesson20;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaskResult implements Callable<String> {
    private int id;

    public TaskResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "result TaskResult " + id;
    }
}
