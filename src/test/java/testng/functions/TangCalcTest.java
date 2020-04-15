package testng.functions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangCalcTest extends BaseTestForAllTests {

    @Test(dataProvider = "dataForTgDouble", groups = "trigonometry")
    public void tgDouble(double firstValue, double expectedValue) {
        double tgDoubleResult = calculator.tg(firstValue);
        Assert.assertEquals(tgDoubleResult, expectedValue, "Invalid result");
    }

    @DataProvider(name = "dataForTgDouble")
    public Object[][] dataForTgDouble() {
        return new Object[][]{
                {0.523599, 0.577},
                {0.7854, 1},
                {1.047, 1.732}
        };
    }
}
