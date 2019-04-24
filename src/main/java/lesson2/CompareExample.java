package lesson2;

public class CompareExample {
    public static void main(String[] args) {
        if (false | true) {
            System.out.println("?");
        }

        if (false || true) {
            System.out.println("!");
        }
    }
}
