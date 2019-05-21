package lesson4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Eatable eatable = new EatableWithMeat();
        Cat barsik = new Barsik();
        barsik.setEatable(eatable);
        barsik.getEatable();
        Dog dog = new Mukhtar();

        Cat[] cats = new Cat[10];
        cats[1] = barsik;

        System.out.println(Arrays.toString(cats));
        int count = 0;
        for (int i = 0; i < cats.length; i++) {

            if (cats[i] != null) {
                System.out.println("Cats summ: " + ++count);
            }
        }

        count = 0;

        for (Cat cat : cats) {
            if (cat != null) {
                System.out.println(++count);
            }
        }
    }

}
