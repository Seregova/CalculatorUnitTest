
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongCalcTest extends BaseTestForAllTests{


    @Test(dataProvider = "dataForSumLong")
    public void longPlusLong(long firstValue, long secondValue, long expectedValue){
       long sumLongResult = calculator.sum(firstValue, secondValue);
        Assert.assertEquals(sumLongResult, expectedValue, "Invalid result");

    }
    @DataProvider(name = "dataForSumLong")
    public Object[][] dataForSumLong(){
        return new Object[][]{
                {123, 456, 579},
                {-100, 1, -99},
                {200, -130, 70}
        };
    }
}
