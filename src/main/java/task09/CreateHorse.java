package task09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CreateHorse {

    List<Horse> factoryHorse() {
        List<Horse> horse = new ArrayList<>();
        horse.add(new Horse(0, "Barsik", new Random().nextInt(25) + 70));
        horse.add(new Horse(1, "Myrzik", new Random().nextInt(25) + 70));
        horse.add(new Horse(2, "Tatoshka", new Random().nextInt(25) + 70));
        horse.add(new Horse(3, "Antoshka", new Random().nextInt(25) + 70));
        horse.add(new Horse(4, "Kyrlik", new Random().nextInt(25) + 70));
        horse.add(new Horse(5, "Kyrlik", new Random().nextInt(25) + 70));
        return horse;
    }
}
