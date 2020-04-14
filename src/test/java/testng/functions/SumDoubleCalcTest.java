package functions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleCalcTest extends BaseTestForAllTests {

    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-class. Thread id is: " + id);
    }

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

    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-class. Thread id is: " + id);
    }
}
