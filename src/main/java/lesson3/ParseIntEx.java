package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ParseIntEx {

    transient int sount;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String value = reader.readLine();

        System.out.println(Integer.parseInt(value) + 5);
        reader.close();
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    protected class Cat {


    }
}
