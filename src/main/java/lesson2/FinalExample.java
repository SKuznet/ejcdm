package lesson2;

import java.util.ArrayList;
import java.util.List;

public class FinalExample {
    final static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        list.add("Barsik");
        System.out.println(list);
    }

    private static short getSum(short val1, short val2) {
        return (short) (val1 + val2);
    }
}
