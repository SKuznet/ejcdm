package lesson10;

public interface IntC {
    static void getC() {
        System.out.println("I am static");
    }

    default void getInfo() {
        System.out.println("I am C");
    }
}
