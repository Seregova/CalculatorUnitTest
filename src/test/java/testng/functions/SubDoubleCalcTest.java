package functions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoubleCalcTest extends BaseTestForAllTests {

    @Test(dataProvider = "dataForSubDouble")
    public void doubleMinusDouble(double firstValue, double secondValue, double expectedValue) {
        double subDoubleResult = calculator.sub(firstValue, secondValue);
        Assert.assertEquals(subDoubleResult, expectedValue, "Invalid result");

    }

    @DataProvider(name = "dataForSubDouble")
    public Object[][] dataForSubDouble() {
        return new Object[][]{
                {11.3, 45.6, -34.3},
                {-13.78, -55.89, 42.11},
                {-0.2, 1.3, -1.5}
        };
    }
}
