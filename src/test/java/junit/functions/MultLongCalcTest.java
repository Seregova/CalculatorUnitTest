package junit.functions;

import org.junit.Assert;
import org.junit.Test;


public class MultLongCalcTest extends BaseTestForAllTests {
    @Test
    public void longMultLong() {
        long multLongResult = calculator.mult(777, 10);
        Assert.assertEquals("Invalid result", 7770, multLongResult);
    }
}
