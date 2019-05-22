package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Barsik", "Murzik");

        for (String n : list) {

        }

    }

    private static void inputValue() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input time: ");
        try {
            int time = Integer.parseInt(reader.readLine().trim());
            if (time < 0) {
                System.out.println("\nError. You entered a negative number.\n");
                inputValue();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.getMessage();
            System.out.print("\nError. You entered not a number.\n\n");
            inputValue();
        }
    }


    public String replaceChar(String string, String ch) {
        String emptyString = "";
        if (string.isEmpty()) {
            return string;
        } else {
            return string.replace(ch, emptyString);
        }
    }
}
