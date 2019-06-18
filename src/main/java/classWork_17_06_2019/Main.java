package classWork_17_06_2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> bestScore_and_ArrayScore;
        bestScore_and_ArrayScore = Score.getSoreMaxValue();
        List<String> lll;
        lll= Names.getNames();
//        for (Map.Entry<String, Object> entry : bestScore_and_ArrayScore.entrySet()) {
//            System.out.println(entry.getKey() + "= " + entry.getValue());
//        }
////        String resultStr = str.substring(str.indexOf('.') + 1, str.indexOf(':'));
//        String secondeName=(lll.get(((int) bestScore_and_ArrayScore.get("Number winner"))-1)).toString();
//        System.out.println("Name winner=" + secondeName.substring(secondeName.length() - 6, secondeName.length()));
        System.out.println("Number winner="+bestScore_and_ArrayScore.get("Number winner"));
        System.out.println("Max points="+bestScore_and_ArrayScore.get("Max points"));

        System.out.println("Name winner=" + (lll.get(((int) bestScore_and_ArrayScore.get("Number winner"))-1)));
        int[][] arrayPoint = (int[][]) Score.getSoreMaxValue().get("Get all points");
        for (int l = 0; l < 20; l++) {
            System.out.print(Names.getNames().get(l) + "  ");
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + arrayPoint[l][j]);
            }
            System.out.println("  " + ((List) (bestScore_and_ArrayScore.get("Sum for 5 test"))).get(l));
        }
    }


}