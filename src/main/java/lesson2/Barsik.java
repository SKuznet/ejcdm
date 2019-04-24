package lesson2;

public class Barsik extends Cat implements Animal {

    public static void main(String[] args) {
        Barsik barsik = new Barsik();
        Animal animal = new Murzik();
        System.out.println(barsik instanceof Animal);
        System.out.println(animal instanceof Barsik);
        int count;

        count = 1 > 3 ? 5 : 2;

        if (1 > 3) {
            count = 5;
        } else {
            count = 2;
        }
        System.out.println(count);

        System.out.println(2 + 5 * 2);
        System.out.println((2 + 5) * 2);
        System.out.println("s" + 2 + 5);

        int i = 3;
        i = -i++ + i++ + -i;
        System.out.println(i);

    }
}
