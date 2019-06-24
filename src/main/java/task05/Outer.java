package task05;
/**
 * question 9. What is the result of the following code?
 */
public class Outer {

    private int x = 24;

    public int getX() {
        String message = "x is ";
        class Inner {
            private int x = Outer.this.x;

            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }

    public static void main(String[] args) {
        new Outer().getX();
    }
}