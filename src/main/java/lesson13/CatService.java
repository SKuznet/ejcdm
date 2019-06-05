package lesson13;

import java.util.concurrent.TimeUnit;

public class CatService {

    public CatService() {
        try {
            TimeUnit.MILLISECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public long getTimeOfCats(long ownTime) {
        if(ownTime > 0) {
            // logic
            return System.currentTimeMillis() - ownTime;
        }

        System.out.println("message should be there!");

        throw new IllegalArgumentException("own time can't be negative or zero");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
