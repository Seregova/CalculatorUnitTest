package testng.functions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDoubleCalcTest extends BaseTestForAllTests {
    @Test(dataProvider = "dataForMultDouble")
    public void doubleMultDouble(double firstValue, double secondValue, double expectedValue) {
        double multDoubleResult = calculator.mult(firstValue, secondValue);
        Assert.assertEquals(multDoubleResult, expectedValue, "Invalid result");

    }

    @DataProvider(name = "dataForMultDouble")
    public Object[][] dataForMultDouble() {
        return new Object[][]{
                {5.79, 4.56, 26.4024},
                {-1.111, 1.9, -2.1109},
                {-2.9, -1.3, 3.77}
        };
    }
}

