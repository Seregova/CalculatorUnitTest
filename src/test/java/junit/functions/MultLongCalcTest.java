package testng.functions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLongCalcTest extends BaseTestForAllTests {

    @Test(dataProvider = "dataForMultLong")
    public void longMultLong(long firstValue, long secondValue, long expectedValue) {
        long multLongResult = calculator.mult(firstValue, secondValue);
        Assert.assertEquals(multLongResult, expectedValue, "Invalid result");

    }

    @DataProvider(name = "dataForMultLong")
    public Object[][] dataForMultLong() {
        return new Object[][]{
                {579, 456, 264024},
                {-100, 1, -100},
                {-2, -13, 26}
        };
    }
}

