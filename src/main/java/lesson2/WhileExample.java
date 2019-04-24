package lesson2;

public class WhileExample {
    public static void main(String[] args) {
        boolean isTrue = true;
        int i = 5;

        while (isTrue) {
            System.out.println(i++);

            if (i == 10) {
                isTrue = false;
            }
        }


        do {
            System.out.println("Prived!");
        } while (isTrue);
    }
}
