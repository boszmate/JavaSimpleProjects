package math;

import org.junit.Assert;
import org.junit.Test;

public class MathSumTest {

    @Test
    public void testSum() {
        // is
        int [] numbers = {1, 2, 3};

        // then
        int result = Math.calculateSum(numbers);

        // expected
        Assert.assertEquals(6, result);
    }
}
