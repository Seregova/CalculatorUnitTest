import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLongCalcTest extends BaseTestForAllTests {

    @Test(dataProvider = "dataForSubLong")
    public void longMinusLong(long firstValue, long secondValue, long expectedValue) {
        long subLongResult = calculator.sub(firstValue, secondValue);
        Assert.assertEquals(subLongResult, expectedValue, "Invalid result");

    }

    @DataProvider(name = "dataForSubLong")
    public Object[][] dataForSubLong() {
        return new Object[][]{
                {579, 456, 123},
                {-100, 1, -101},
                {-200, -130, -70}
        };
    }
}

