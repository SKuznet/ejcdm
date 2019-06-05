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

    private String message = "some message from will to pirate!";

    public long getTimeOfCats(long ownTime) {

        System.out.println(message);

        if(ownTime > 0) {
            // logic
            return System.currentTimeMillis() - ownTime;
        }

        throw new IllegalArgumentException("own time can't be negative or zero");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
