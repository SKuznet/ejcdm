package lesson2;

public class IfElseExample {
    public static void main(String[] args) {

    }

    void checkSome(String color) {
        if (Color.valueOf(color) == Color.GREEN) {
            System.out.println("RUN");
        } else if (Color.valueOf(color) == Color.RED){
            System.out.println("STOP!");
        } else {
            throw new IllegalArgumentException("Wrong color: " + color);
        }
    }
}
