package task04;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        task04.Cat barsik = new task04.Cat(54, "Barsik", "angry bird");
        task04.Cat barsik1 = new task04.Cat(55, "Barsik1", "happy");
        task04.Cat barsik2 = new task04.Cat(54, "Barsik", "angry bird");
        task04.Cat barsik3 = new task04.Cat(57, "Barsik3", "happy");

        task04.CatColliz myrzik = new CatColliz(54, "Myrzik", "angry bird");
        task04.CatColliz myrzik1 = new CatColliz(55, "Myrzik1", "happy");
        task04.CatColliz myrzik2 = new CatColliz(56, "Myrzik2", "angry bird");
        task04.CatColliz myrzik3 = new CatColliz(57, "Myrzik3", "happy");

        System.out.println("Сollision hash code");
        HashMap<task04.Cat, String> lose = new HashMap<>();
        lose.put(barsik, "Barsik");
        lose.put(barsik1, "Barsik1");
        lose.put(barsik2, "Barsik2");
        lose.put(barsik3, "Barsik3");
        System.out.println(myrzik.hashCode());
        System.out.println(myrzik1.hashCode());
        System.out.println(myrzik2.hashCode());
        System.out.println(myrzik3.hashCode());

        System.out.println("Lose Barsik");
        System.out.println(barsik.hashCode());
        barsik.setId(53);
        System.out.println(barsik.hashCode());
        System.out.println(lose.get(barsik));

        HashMap<Cat, String> find = new HashMap<>(lose);
        System.out.println("Find Barsik - " + find.get(barsik));
        System.out.println(find);
    }
}
