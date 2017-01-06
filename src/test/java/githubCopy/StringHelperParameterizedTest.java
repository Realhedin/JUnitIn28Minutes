package githubCopy;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

/**
 * JUnit parameterized tests for StringHelper
 *
 * Created by dkorolev on 1/6/2017.
 */
@RunWith(Parameterized.class) //1
public class StringHelperParameterizedTest {

    static StringHelper helper;

    private String input;
    private String expected;


    @BeforeClass
    public static void setUp() {
        helper = new StringHelper();
    }

    //Constructor to use parameters  //3
    public StringHelperParameterizedTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
        System.out.println("Constructor created.");
    }

    @Parameters //2
    public static Collection<String[]> testCondition() {
        String expectedOutputs[][] = {
        {"AACD","CD"},
        {"ACD","CD"}};
        System.out.println("TestCondition parameters created.");
        return Arrays.asList(expectedOutputs);
    }


    @Test
    public void testTruncateAInFirst2Positions_changeValue() throws Exception {
        assertEquals(expected,helper.truncateAInFirst2Positions(input));
    }




}