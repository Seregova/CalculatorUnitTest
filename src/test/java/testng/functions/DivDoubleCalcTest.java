package functions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDoubleCalcTest extends BaseTestForAllTests {
    @Test(dataProvider = "dataForDivDouble")
    public void doubleDivDouble(double firstValue, double secondValue, double expectedValue) {
        double divDoubleResult = calculator.div(firstValue, secondValue);
        Assert.assertEquals(divDoubleResult, expectedValue, "Invalid result");

    }

    @DataProvider(name = "dataForDivDouble")
    public Object[][] dataForDivDouble() {
        return new Object[][]{
                {4.55, 1.4, 3.25},
                {-12.99, 3, -4.33},
                {1000.1, 10, 100.01}
        };
    }
}
