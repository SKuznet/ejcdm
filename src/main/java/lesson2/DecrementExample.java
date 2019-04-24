package lesson2;

public class DecrementExample {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("count is: " + count);
            int j = ++count;
            System.out.println("j is: " + j);
        }

        count *= 10;
        System.out.println(count);
    }
}
