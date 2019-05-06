package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    final static String catName = "Barsik";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String result = reader.readLine();

        switch (result) {
            case catName:
                System.out.println("It's my previous cat :(");
                break;
            case "Murzik":
                System.out.println("Alien cat");
                break;
            case "Yukki":
                System.out.println("It's my current cat!");
                break;
            default:
                System.out.println("I think it's Riska");
        }

        if (result.equals("Barsik")) {
            System.out.println("It's my previous cat :(");
        } else if (result.equals("Murzik")) {
            System.out.println("Alien cat");
        } else if (result.equals("Yukki")) {
            System.out.println("It's my current cat!");
        } else {
            System.out.println("I think it's Riska");
        }

        reader.close();


    }
}
