package task_08_Light_Version;

import java.util.TreeSet;

public class AllBalls {
    public static void main(String[] args) {
        TreeSet<BallsName> collectionBalls = new TreeSet<>(BallsName::compareTo);
        collectionBalls.addAll(CollectionBalls.createBallsBad());
        collectionBalls.addAll(CollectionBalls.createBallsRight());
        System.out.println(collectionBalls);

        collectionBalls.remove(new BallsName(3, 10));
        collectionBalls.remove(new BallsName(17, 10));
        System.out.println(collectionBalls);
    }
}
