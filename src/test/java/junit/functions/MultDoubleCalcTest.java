package junit.functions;

import org.junit.Assert;
import org.junit.Test;

public class MultDoubleCalcTest extends BaseTestForAllTests {
    @Test
    public void doubleMultDouble() {
        double multDoubleResult = calculator.mult(6.6, 10.55);
        Assert.assertEquals("Invalid result",69.63, multDoubleResult, 0.0);
    }

}

