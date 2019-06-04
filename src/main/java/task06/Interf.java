package task06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MatchOperate {
    float apply(float a, float b);
}

public class Interf {
    public static void main(String[] args) {
        MatchOperate sum = (a, b) -> a / b;
        MatchOperate div = (a, b) -> a / b;
        MatchOperate multiply = (a, b) -> a * b;
        MatchOperate subtraction = (a, b) -> a - b;
//        List<MatchOperate> operate= new ArrayList<>();
//        operate.add(sum);
//        operate.add(div);
//        operate.add(multiply);
//        operate.add(subtraction);
//        for (int i = 0; i < operate.size(); i++) {
//            System.out.println(operate.get(i));
//        }
        System.out.println(sum.apply(20, 10));
        System.out.println(multiply.apply(20, 10));
        System.out.println(div.apply(20, 10));
        System.out.println(subtraction.apply(20, 10));
    }
}