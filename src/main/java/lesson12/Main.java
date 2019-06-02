package lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Barsik");
        list.add("Murzik");
        list.add("Murzik");

        // WRONG!!! use iterator
        for (String cat : list) {
            if (cat.equals("Murzik")) {
                list.remove(cat);
            }
        }

        list.removeIf(o -> o.equals("Murzik"));

        File file = new File("");
        try {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException();
            } finally {
                System.out.println("I am in finally");

            }
        } catch (RuntimeException e) {

        }

        System.out.println("hahaha");

    }

    public void getInfo() throws IOException {
        throw new IOException();
    }
}
