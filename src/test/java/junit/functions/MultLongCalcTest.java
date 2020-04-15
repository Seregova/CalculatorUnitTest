package junit.functions;

import org.junit.Assert;
import org.junit.Test;


public class MultLongCalcTest extends BaseTestForAllTests {
    @Test
    public void longMultLong() {
        double multLongResult = calculator.mult(777, 10);
        Assert.assertEquals(7770, multLongResult, 0.0);
    }

}
