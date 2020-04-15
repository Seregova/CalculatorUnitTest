package testng.functions;

import org.testng.annotations.Test;

public class DivZeroCalcTest extends BaseTestForAllTests {

    @Test(expectedExceptions = NumberFormatException.class)
    public void divLongByZero() {
        long divLongResult;
        divLongResult = calculator.div(1, 0);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divDoubleByZero() {
        double divDoubleResult = calculator.div(1.99, 0);
    }

}
