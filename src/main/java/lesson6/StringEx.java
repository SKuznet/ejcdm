package lesson6;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        String name = "barsik";

        System.out.println(name.charAt(2));
        char[] chars = new char[]{'_','_','_','_','_','_','_','_','_','_'};

        name.getChars(1, 3, chars, 2 );
        System.out.println(Arrays.toString(chars));

        System.out.println("Our string length is: " + name.length());

        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        char c = 114;
        System.out.println(c);

        System.out.println(name.codePointAt(2));

        System.out.println(Arrays.toString(name.getBytes()));

        String newName = "bar";
        newName = (newName + "sik").intern();

        System.out.println(name.equals(newName));

        System.out.println(name.compareTo(newName));

        System.out.println(name.contentEquals("barsik"));

        name = name.toUpperCase();
        System.out.println(name);

        char[] arr = name.toCharArray();

        String jackal = "jackala";
        System.out.println(jackal.indexOf("c"));

        System.out.println(jackal.lastIndexOf("a"));

        System.out.println(jackal.replace("a", "o"));
        System.out.println(jackal.replaceAll("a", "o"));

        System.out.println(name.contains("BRS"));

        System.out.println(name.endsWith("AIK"));

        System.out.println(name.startsWith("BA"));
        System.out.println(name.startsWith("AR", 1));

        String bird = " A RA ";
        System.out.println(bird.length());
        System.out.println(bird.trim().length());

        String pirat = "Jack Vorobei";
        System.out.println(pirat.substring(5));

        String newPirat = "Jack Vorobei the Captain";

        System.out.println(newPirat.substring(5, 12));

        String response = "Jack, yandex.ru, owner";

        System.out.println(Arrays.toString(response.split(",")));

        StringBuilder builder = new StringBuilder();
        builder
                .append("Barsik")
                .append(" the")
                .append(" ")
                .append("cat")
                .append("!");

        System.out.println(builder.toString());
        System.out.println(builder.reverse());
    }

    public String getValue() {
        return "a" + "b";
    }
}
