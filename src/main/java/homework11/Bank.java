package homework11;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Bank {
    private static int money = 1_000_000_000;

    private Map<String, Integer> list;

    Bank(){
        list = new HashMap<>();
        list.put("Ivanov", 100_000_000);
        list.put("Petrov", 100_000_000);
        list.put("Sidorov", 100_000_000);
    }
}
