package task10;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class ScoreTest {

    @Test
    public void getSoreMaxValue() {
        Map<String, Object> expectedCheck = Score.getSoreMaxValue();
        assertNotNull(expectedCheck.get("Max points"));
        assertNotNull(expectedCheck.get("Number winner"));
        assertNotNull(expectedCheck.get("Get all points"));
        assertNotNull(expectedCheck.get("Sum for 5 test"));
        assertArrayEquals((int[][]) expectedCheck.get("Get all points"), (int[][]) expectedCheck.get("Get all points"));
    }
}