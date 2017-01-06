package githubCopy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Comparing arrays.
 *
 * Created by dkorolev on 1/6/2017.
 */
public class ArraysCompareTest {

    int[] numbers;
    int[] expected;

    @Before
    public void setUp() {
        numbers = new int[]{12, 3, 4, 1};
        expected = new int[]{1, 3, 4, 12};
    }

    @Test
    public void testArraySort_Array() {
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }


    @Test(expected = NullPointerException.class)
    public void testArraySort_Null() {
        numbers = null;
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }


    @Rule
    public ExpectedException npe = ExpectedException.none();

    @Test
    public void testArraySort_NPEWithRule() {
        numbers = null;
        npe.expect(NullPointerException.class);
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test(timeout = 200)
    public void testSort_Performance() {
        int array[] = {12, 23, 4};
        for (int i = 0; i < 1000000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
