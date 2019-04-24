package lesson2;

public class EvenExample {
    public static void main(String[] args) {
        EvenExample evenExample = new EvenExample();
        System.out.println(evenExample.isEven(4));
        System.out.println(evenExample.isEven(3));
    }

    private boolean isEven(int val) {
        return val % 2 == 0;
    }
}
