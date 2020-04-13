import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleCalcTest extends BaseTestForAllTests {

    @Test(dataProvider = "dataForSumDouble")
    public void doublePlusDouble(double firstValue, double secondValue, double expectedValue) {
        double sumDoubleResult = calculator.sum(firstValue, secondValue);
        Assert.assertEquals(sumDoubleResult, expectedValue, "Invalid result");

    }

    @DataProvider(name = "dataForSumDouble")
    public Object[][] dataForSumDouble() {
        return new Object[][]{
                {11.3, 45.6, 56.9},
                {-13.78, -55.89, -69.67},
                {-0.2, 1.3, 1.1}
        };
    }
}