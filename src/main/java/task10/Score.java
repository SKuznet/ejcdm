package task10;

import java.util.*;

import static java.util.Collections.max;

class Score {
    static Map<String, Object> getSoreMaxValue() {
        int sumPoints;
        List<Integer> bestScore = new ArrayList<>();
        int[][] arrayScore = new int[20][6];
        for (int i = 0; i < 20; i++) {
            sumPoints = 0;
            for (int j = 0; j < 5; j++) {
                arrayScore[i][j] = 1 + (int) (Math.random() * 90);
                sumPoints = sumPoints + arrayScore[i][j];
            }
            bestScore.add(sumPoints);
        }
        Map<String, Object> map = new HashMap<>();
        Integer maxPoints = max(bestScore);
        Integer numberWinner = bestScore.indexOf(maxPoints) + 1;

        map.put("Max points", maxPoints);
        map.put("Number winner", numberWinner);
        map.put("Get all points", arrayScore);
        map.put("Sum for 5 test", bestScore);

        return map;
    }
}




