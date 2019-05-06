package lesson3;

public class Ex2 {
    public static void main(String[] args) {
        String name = "jack";
        System.out.println("before: " + name);
        changeName(name);
        System.out.println("after " + name);
    }

    static void changeName(String name) {
        System.out.println("before change " + name);
        name = name + " vorobei";
        System.out.println("after change " + name);
    }
}
