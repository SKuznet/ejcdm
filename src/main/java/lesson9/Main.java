package lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Character[] characters = new Character[10];
//
//        characters[0] = 'B';
//        characters[1] = 'a';
//        characters[2] = 'r';
//        characters[3] = 's';
//        characters[4] = 'i';
//        characters[5] = 'k';
//
//        Map<Character[], String> map = new HashMap<>();
//
//        map.put(characters, "Barsik");
//
//        map.forEach((s, v) -> {
//            for (Character character : s) {
//                if (character != null) {
//                    System.out.print(character);
//                }
//            }
//            System.out.print(" ");
//            System.out.println(v);
//        });
//
//        characters[0] = 'M';
//        characters[1] = 'u';
//        characters[2] = 'r';
//        characters[3] = 'z';
//        characters[4] = 'i';
//        characters[5] = 'k';
//
//        map.put(characters, "Murzik");
//        map.forEach((s, v) -> {
//            for (Character character : s) {
//                if (character != null) {
//                    System.out.print(character);
//                }
//            }
//            System.out.print(" ");
//            System.out.println(v);
//        });
//        Object[] array = new Object[16];
//        List<String> list = new LinkedList<>();
//        list.add("barsik");
//        list.add("murzik");
//        array[1] = list;


//
//        System.out.println(array[1]);
        Set<Cat> set = new HashSet<>();
//
        Cat barsik = new Cat(1, "Barsik", "good");

        set.add(barsik);
//
        System.out.println(set.contains(barsik));
        barsik.setDescription("angry");
        set.add(barsik);
        System.out.println(set);

        Set<Cat> newSet = new HashSet<>(set);
        System.out.println(newSet);

    }
}
