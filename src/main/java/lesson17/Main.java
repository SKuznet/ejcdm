package lesson17;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Cat murzik = new Cat("Murzik");

        Map<Cat, Cat> map = new HashMap<>();
        map.put(barsik, barsik);
        map.put(murzik, murzik);



        System.out.println(map.size());
    }
}
