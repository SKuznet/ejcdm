package task10;

import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Map<String, Object> bestScore_and_ArrayScore;
        bestScore_and_ArrayScore = Score.getSoreMaxValue();
        List<String> listNameGetName;
        listNameGetName = Names.getNames();
        System.out.println("Number winner=" + bestScore_and_ArrayScore.get("Number winner"));
        System.out.println("Max points=" + bestScore_and_ArrayScore.get("Max points"));
        System.out.println("Name winner=" + (listNameGetName.get(((int) bestScore_and_ArrayScore.get("Number winner")) - 1)));
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