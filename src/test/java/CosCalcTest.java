import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalcTest extends BaseTestForAllTests {

        @Test(dataProvider = "dataForCosDouble", groups = "cos")
        public void cosDouble(double firstValue,  double expectedValue) {
            double cosDoubleResult = calculator.cos(firstValue);
            Assert.assertEquals(cosDoubleResult, expectedValue, "Invalid result");

        }

        @DataProvider(name = "dataForCosDouble")
        public Object[][] dataForCosDouble() {
            return new Object[][]{
                    {0.5236, 0.866},
                    {0.7854, 0.707},
                    {1.571, 0}
            };
        }
}
