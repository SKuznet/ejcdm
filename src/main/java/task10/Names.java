package task10;

import java.util.ArrayList;
import java.util.List;

class Names {
    static List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            names.add("Number person  " + (i + 1) + " Last Name-" + (i + 1));
        }
        return names;
    }
}
