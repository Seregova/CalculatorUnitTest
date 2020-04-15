package testng.functions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtDoubleCalcTest extends BaseTestForAllTests {
    @Test(dataProvider = "dataForSqrtDouble")
    public void doubleSqrtDouble(double firstValue, double expectedValue) {
        double sqrtDoubleResult = calculator.sqrt(firstValue);
        Assert.assertTrue(sqrtDoubleResult == expectedValue);
    }

    @DataProvider(name = "dataForSqrtDouble")
    public Object[][] dataForSqrtDouble() {
        return new Object[][]{
                {4, 2},
                {81, 9},
                {102.01, 10.1}
        };
    }
}
