package homework4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Cat, String> map = new HashMap<>();
        Cat barsik = new Cat(1, "Barsik", "good");

        System.out.println(barsik);

        System.out.println(barsik.hashCode());
        map.put(barsik, "Barsik");

        System.out.println(map.containsKey(barsik));
        barsik.setDescription("angry");

        System.out.println(barsik.hashCode());
        System.out.println(map.containsKey(barsik));

        map.put(barsik, "Barsik");
        System.out.println(map.containsKey(barsik));

        System.out.println(map);

        Map<Cat, String> newMap = new HashMap<>(map);
        System.out.println(newMap);
    }
}
