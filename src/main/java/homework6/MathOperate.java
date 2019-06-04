package homework6;

@FunctionalInterface
public interface MathOperate {
    int getResult(int val1, int val2);

    default void getInfo(){
        System.out.println("Multiply value1 for value2 times.");
    }
}
