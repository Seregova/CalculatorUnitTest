package functions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgCalcTest extends BaseTestForAllTests {
    @Test(dataProvider = "dataForCtgDouble", groups = "trigonometry")
    public void ctgDouble(double firstValue, double expectedValue) {
        double ctgDoubleResult = calculator.ctg(firstValue);
        Assert.assertEquals(ctgDoubleResult, expectedValue, "Invalid result");

    }

    @DataProvider(name = "dataForCtgDouble")
    public Object[][] dataForCtgDouble() {
        return new Object[][]{
                {30, 1.732},
                {45, 1},
                {90, 0}
        };
    }
}
