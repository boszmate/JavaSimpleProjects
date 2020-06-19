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

        // excepted
        Assert.assertEquals(6, result);
    }
}
