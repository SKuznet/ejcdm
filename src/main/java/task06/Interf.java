package task06;

import java.util.*;

@FunctionalInterface
interface MatchOperate {
    float apply(float a, float b);

    static void getInfo() {
        System.out.println("You are using MathOperate interface!");
    }
}

public class Interf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float firstNum = in.nextFloat();
        float secondNum = in.nextFloat();
        Map<String, MatchOperate> opa = new HashMap<>();
        opa.put("Sum", (a, b) -> a + b);
        opa.put("Div", (a, b) -> a / b);
        opa.put("Multiplication", (a, b) -> a * b);
        opa.put("Minus", (a, b) -> a - b);
        for (Map.Entry<String, MatchOperate> entry : opa.entrySet()) {
            System.out.println(entry.getKey() + "= " + entry.getValue().apply(firstNum, secondNum));
        }
        MatchOperate.getInfo();
    }

}

