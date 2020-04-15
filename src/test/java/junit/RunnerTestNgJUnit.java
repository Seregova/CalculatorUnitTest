package junit;

import junit.functions.MultDoubleCalcTest;
import junit.functions.MultLongCalcTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        MultLongCalcTest.class,
        MultDoubleCalcTest.class
})

public class RunnerTestNgJUnit {}