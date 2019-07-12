package task10;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NamesTest {

    @Test
    public void getNames() {
        List<String> expectedCheck = Names.getNames();
        assertNotNull(expectedCheck);
    }
}