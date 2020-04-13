import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegLongCalcTest extends BaseTestForAllTests {
    @Test(dataProvider = "dataForNegLong")
    public void negLong(long firstValue, boolean expectedValue) {
        boolean negLongResult = calculator.isNegative(firstValue);
        Assert.assertTrue(negLongResult == expectedValue);
    }

    @DataProvider(name = "dataForNegLong")
    public Object[][] dataForNegLong() {
        return new Object[][]{
                {4, false},
                {-1, true},
                {-100646700, true}
        };
    }
}
