package lesson13;

import org.junit.*;

import static org.junit.Assert.*;

public class CatServiceTest {
    private CatService catService;

    @Before
    public void init() {
       catService = new CatService();
    }

    @BeforeClass
    public static void globalInit() {

    }

    @After
    public void clean() {

    }

    @AfterClass
    public static void globalClean() {

    }

    @Test
    public void testGetTimeOfCats() {
        long catOwnTime = catService.getTimeOfCats(3 * 24 * 60 * 60 * 1000);
        assertTrue(catOwnTime > 0);
    }

}
