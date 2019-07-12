package task_08_Light_Version;


import java.util.*;

class CollectionBalls {
    static TreeSet<BallsName> createBallsBad() {
        TreeSet<BallsName> ballsBad = new TreeSet<>(BallsName::compareTo);
        ballsBad.add(new BallsName(2, 15));
        ballsBad.add(new BallsName(7, 15));
        return ballsBad;
    }

    static TreeSet<BallsName> createBallsRight() {
        TreeSet<BallsName> ballsRight = new TreeSet<>(BallsName::compareTo);
        for (int i = 0; i < 20; i++) {
            ballsRight.add(new BallsName(i, 10));
        }
        ballsRight.remove(new BallsName(2, 10));
        ballsRight.remove(new BallsName(7, 10));
        return ballsRight;
    }
}