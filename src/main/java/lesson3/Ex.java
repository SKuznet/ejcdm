package lesson3;

public class Ex {
    public static void main(String[] args) {
        Ex ex = new Ex();
        System.out.println(ex.getCount(1));
    }

    int getCount(int count) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            count = 5;
            return count;
        } finally {
            count = 10;
        }
    }
}
