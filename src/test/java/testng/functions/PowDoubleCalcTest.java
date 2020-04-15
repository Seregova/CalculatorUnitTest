package testng.functions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowDoubleCalcTest extends BaseTestForAllTests {

    @Test(dataProvider = "dataForPowDouble")
    public void doublePowDouble(double firstValue, double secondValue, double expectedValue) {
        double powDoubleResult = calculator.pow(firstValue, secondValue);
        //Assert.assertTrue(powDoubleResult == expectedValue);
        Assert.assertEquals(powDoubleResult, expectedValue, "Invalid result");
    }

    @DataProvider(name = "dataForPowDouble")
    public Object[][] dataForPowDouble() {
        return new Object[][]{
                {10, 2, 100},
                {3, 3, 27},
                {10.1, 2, 102.01}
        };
    }
}

