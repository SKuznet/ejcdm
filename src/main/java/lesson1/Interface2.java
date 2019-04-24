package lesson1;

public interface Interface2 {
    int count = 2;

    static void getName() {
        System.out.println();
    }

    default void getInfo() {
        System.out.println(count);
    }
}
