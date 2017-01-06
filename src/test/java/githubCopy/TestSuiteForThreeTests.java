package githubCopy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.runners.Suite.*;

/**
 * Suite to run concreate tests
 *
 * Created by dkorolev on 1/6/2017.
 */
@RunWith(Suite.class)
@SuiteClasses({BooleanHelperParametrizedTest.class, StringHelperParameterizedTest.class})
public class TestSuiteForThreeTests {

}
