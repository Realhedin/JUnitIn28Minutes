package githubCopy;

import org.junit.*;

/**
 * Usage of before and after.
 *
 * Created by dkorolev on 1/6/2017.
 */
public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void setup() {
        System.out.println("Before test");
    }

    @Test
    public void test() {
        System.out.println("TEst executed");
    }

    @Test
    public void test2() {
        System.out.println("TEst2 executed");
    }

    @After
    public void end() {
        System.out.println("AFter test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class test");
    }
}
