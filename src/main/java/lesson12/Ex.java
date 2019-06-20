package lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ex {
class Barsik extends Ex {
    public String name = null;


}
    public static void main(String[] args) {
        Barsik barsik = new Ex().new Barsik();

        Map<String, String> map1 = new HashMap<String, String>() {
            {
                put("Barsik", null);
                put("Barsik", null);
                put("Barsik", null);
            }
        };

        if (Objects.equals(barsik.name, "asd")) {
            System.out.println("123");
        }
    }
}
