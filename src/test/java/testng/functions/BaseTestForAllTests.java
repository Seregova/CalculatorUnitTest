package testng.functions;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestForAllTests {
    Calculator calculator;
    @BeforeClass(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }
    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}
