package githubCopy;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * JUnit tests for StringHelper
 *
 * Created by dkorolev on 1/6/2017.
 */
@RunWith(Parameterized.class)
public class BooleanHelperParametrizedTest {

    static StringHelper helper;

    private String input;
    private String falseInput;

    @BeforeClass
    public static void setUp() {
        helper = new StringHelper();
    }


    public BooleanHelperParametrizedTest(String input, String falseInput) {
        this.input = input;
        this.falseInput = falseInput;
    }


    @Parameters
    public static Collection<String[]> parametersForTest() {
        String expectedOutputs[][] = {
                {"ABAB","ABCD"},
                {"AB","A"}};
        System.out.println("TestCondition parameters created.");
        return Arrays.asList(expectedOutputs);
    }


    //ABCD => false, ABAB => true, AB => true, A=> false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_theSame() throws Exception {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_notTheSame() throws Exception {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame(falseInput));
    }
}