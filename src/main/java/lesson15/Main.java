package lesson15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("asd", "asd2", "asd");
        Set<String> set = new HashSet<>();
        set.add("barsik");

        set.addAll(list);

        System.out.println(set);

        ArrayList<String> newList = new ArrayList<>(list);
        newList.removeIf(O -> O.equals("asd"));
        System.out.println(newList);
    }
}
