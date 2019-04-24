package lesson2;

public class Snegok {
    private static int i;

    static {
        i = 5;
    }

    public static int getI() {
        return i;
    }

    public static void main(String[] args) {
        System.out.println(getI());
    }
}
