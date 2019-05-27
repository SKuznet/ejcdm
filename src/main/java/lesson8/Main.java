package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String value = reader.readLine();
            CatInterface cat;

            if (value.equalsIgnoreCase("barsik")) {
                cat = new Barsik();
            } else if (value.equalsIgnoreCase("murzik")) {
                cat = new Murzik();
            } else {
                throw new IllegalArgumentException("our cat name should be barsik or murzik. Not - " + value);
            }

            System.out.println(cat.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

        AbstractMainCoon mainCoon = new AbstractMainCoon() {
            @Override
            String getCatInfo() {
                return "hello from abstract";
            }
        };
        System.out.println(mainCoon.getCatInfo());

        Function function;
        BiFunction biFunction;
    }
}
