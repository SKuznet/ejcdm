package homework8test;

import homework8.Game;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class GameTest {
    Game game;

    @Before
    public void init() {
        game = new Game();
    }

    @Test
    public void testInit() {
        Assert.assertNotNull(game.getScore());
    }
}
