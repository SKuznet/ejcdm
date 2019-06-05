package task06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface MatchOperate {
    float apply(float a, float b);
}

public class Interf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float firstNum = in.nextFloat();
        float secondNum = in.nextFloat();
        List<MatchOperate> operation = new ArrayList<>();
        operation.add((a, b) -> a + b);
        operation.add((a, b) -> a / b);
        operation.add((a, b) -> a * b);
        operation.add((a, b) -> a - b);

        List<String> description = new ArrayList<>();
        description.add("Sum= ");
        description.add("Div= ");
        description.add("Multiplication= ");
        description.add("Minus= ");

        for (int i = 0; i < operation.size(); i++) {
            System.out.println(description.get(i) + operation.get(i).apply(firstNum, secondNum));
        }
    }
}
