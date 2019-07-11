package task09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DataCyclicBarrier {
    static List<List<Integer>> dataHorseInTheRun = Collections.synchronizedList(new ArrayList<>());
    static List<Integer> dataHorseInTheFinish = Collections.synchronizedList(new ArrayList<>());
}
