package functions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongCalcTest extends BaseTestForAllTests {

    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-class. Thread id is: " + id);
    }

    @Test(dataProvider = "dataForSumLong")
    public void longPlusLong(long firstValue, long secondValue, long expectedValue) {
        long sumLongResult = calculator.sum(firstValue, secondValue);
        Assert.assertEquals(sumLongResult, expectedValue, "Invalid result");

    }

    @DataProvider(name = "dataForSumLong")
    public Object[][] dataForSumLong() {
        return new Object[][]{
                {123, 456, 579},
                {-100, 1, -99},
                {200, -130, 70}
        };
    }

    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-class. Thread id is: " + id);
    }
}

