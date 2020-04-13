import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalcTest extends BaseTestForAllTests {
    @Test(dataProvider = "dataForSinDouble")
    public void sinDouble(double firstValue,  double expectedValue) {
        double sinDoubleResult = calculator.sin(firstValue);
        Assert.assertEquals(sinDoubleResult, expectedValue, "Invalid result");

    }

    @DataProvider(name = "dataForSinDouble")
    public Object[][] dataForSinDouble() {
        return new Object[][]{
                {0.5236, 0.5},
                {0.7854, 0.707},
                {1.571, 1}
        };
    }
}
