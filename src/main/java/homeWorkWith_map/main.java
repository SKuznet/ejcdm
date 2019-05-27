package homeWorkWith_map;

import java.util.HashMap;
public class main {
    public static void main(String[] args) {
        Cat barsik = new Cat(54, "Barsik", "angry bird");
        Cat barsik1 = new Cat(55, "Barsik1", "happy");
        Cat barsik2 = new Cat(56, "Barsik2", "angry bird");
        Cat barsik3 = new Cat(57, "Barsik3", "happy");

        HashMap<Cat, String> hashMap = new HashMap<>();
        hashMap.put(barsik, "Barsik");
        hashMap.put(barsik1, "Barsik1");
        barsik.setId(53);
        System.out.println(hashMap.get(barsik));
        HashMap<Cat, String> hashMap1 = new HashMap<>(hashMap);
        System.out.println(hashMap1.get(barsik));
        System.out.println(hashMap1);
    }
}
