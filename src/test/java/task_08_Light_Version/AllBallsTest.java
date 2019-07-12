package task_08_Light_Version;

import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.*;

public class AllBallsTest {

    @Test
    public void allBalls() {
        TreeSet<BallsName> expectedCheck = AllBalls.allBalls();
        assertNotNull(expectedCheck);
    }
}