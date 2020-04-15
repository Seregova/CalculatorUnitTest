package testng.functions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositLongCalcTest extends BaseTestForAllTests {

    @Test(dataProvider = "dataForPositLong")
    public void positLong(long firstValue, boolean expectedValue) {
        boolean positLongResult = calculator.isPositive(firstValue);
        Assert.assertTrue(positLongResult == expectedValue);
    }

    @DataProvider(name = "dataForPositLong")
    public Object[][] dataForPositLong() {
        return new Object[][]{
                {4, true},
                {-1, false},
                {0, false}
        };
    }
}
