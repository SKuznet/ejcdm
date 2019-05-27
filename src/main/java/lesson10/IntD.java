package lesson10;

public interface IntD {
    default void getInfo() {
        System.out.println("I am D");
    }
}
