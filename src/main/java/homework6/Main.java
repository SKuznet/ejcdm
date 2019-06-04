package homework6;

public class Main {
    public static void main(String[] args) {
        MathOperate mathOperate = (s, v) -> s * v;
        MathOperate mathOperate1 = (s, v) -> s * v;

        System.out.println(mathOperate.getResult(10, 2));
        System.out.println(mathOperate1.getResult(2, 10));
        mathOperate.getInfo();
        mathOperate1.getInfo();
    }
}
