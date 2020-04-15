package junit.functions;

import org.junit.Assert;
import org.junit.Test;


public class MultDoubleCalcTest extends BaseTestForAllTests {

    @Test
    public void doubleMultDouble() {
        double multDoubleResult = calculator.mult(6, 10);
        Assert.assertEquals(60.0, multDoubleResult, 0.0);
    }

}

