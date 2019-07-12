package task_08_Light_Version;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.*;

public class CollectionBallsTest {

    @Test
    public void createBallsRight1() {
        TreeSet<BallsName> expectedCheck = CollectionBalls.createBallsRight();
        assertNotNull(expectedCheck);
    }

    @Test
    public void createBallsBad() {
        TreeSet<BallsName> expectedCheck = CollectionBalls.createBallsBad();
        assertNotNull(expectedCheck);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Finish test  CollectionsBalls.class");
    }
}