package homework8test;

import homework8.Ball;
import homework8.Bowling;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class BowlingTest {
    Bowling bowling;

    @Before
    public void init() {
        bowling = new Bowling();
    }

    @Test
    public void testInit() {
        Assert.assertNotNull(bowling.getBalls());
        Assert.assertNotNull(bowling.getFakeBalls());
        Assert.assertTrue(Collections.disjoint(bowling.getBalls(), bowling.getFakeBalls()));
    }

    @Test
    public void testDelete() {
        Assert.assertNotNull(bowling.getFakeBalls());
        Assert.assertNotNull(bowling.getBalls());
        bowling.delite(3);
        for (Ball ball : bowling.getBalls()) {
            Assert.assertFalse(ball.getId() == 3);
        }
        bowling.delite(17);
        for (Ball ball : bowling.getBalls()) {
            Assert.assertFalse(ball.getId() == 17);
        }
    }
}
