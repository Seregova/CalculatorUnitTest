package functions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivLongCalcTest extends BaseTestForAllTests {
    @Test(dataProvider = "dataForDivLong")
    public void longDivLong(long firstValue, long secondValue, long expectedValue) {
        double divLongResult = calculator.div(firstValue, secondValue);
        Assert.assertEquals(divLongResult, expectedValue, "Invalid result");

    }

    @DataProvider(name = "dataForDivLong")
    public Object[][] dataForDivLong() {
        return new Object[][]{
                {100, 1, 100},
                {-12, 3, -4},
                {1000, 10, 100}
        };
    }
}

