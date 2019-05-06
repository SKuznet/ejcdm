package lesson3;

public class Ex4 {
    public static void main(String[] args) {
        String name = new String("Barsik");
        String name2 = ("Bar" + "sik").intern();
        System.out.println(name);
        System.out.println(name2);

        System.out.println(name.equals(name2));
        System.out.println(name == name2);
    }
}
