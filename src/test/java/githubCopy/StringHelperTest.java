package githubCopy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit tests for StringHelper
 *
 * Created by dkorolev on 1/6/2017.
 */
public class StringHelperTest {

    static StringHelper helper;

    @BeforeClass
    public static void setUp() {
        helper = new StringHelper();
    }


    @Test
    public void testTruncateAInFirst2Positions_changeValue() throws Exception {
        assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
//        Assert.assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
//        Assert.assertEquals("CDEF",helper.truncateAInFirst2Positions("CDEF"));
//        Assert.assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));
    }

    @Test
    public void testTruncateAInFirst2Positions_notChangeValue() {
        assertEquals("CDEF",helper.truncateAInFirst2Positions("CDEF"));
    }


    //ABCD => false, ABAB => true, AB => true, A=> false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_theSame() throws Exception {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_notTheSame() throws Exception {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }
}