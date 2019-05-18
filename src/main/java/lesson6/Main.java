package lesson6;

public class Main {
    static String nullValue;

    public static void main(String[] args) {
        char[] array = new char[]{'B', 'A', 'R', 'S'};
        // new object
        String name = "Barsik";
        // new obj
        name = "Murzik";

        name = new String(array, 1, 2);
        System.out.println(name);
        String value = "";
        System.out.println(nullValue);
        Main main = new Main();
        System.out.println("abc".equals(main.someString()));
    }

    private String someString() {
        return "abc";
    }
}
