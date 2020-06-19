package math;

import org.junit.Assert;
import org.junit.Test;

public class MathFactorialTest {
    @Test
    public void testFactorialWithLowNumber() {
        // is
        int n = 3;

        // then
        final int result = Math.factorial(n);

        // expected
        Assert.assertEquals(6, result);
    }

    @Test
    public void testFactorialWithHighNumber() {
        // is
        int n = 10;

        // then
        final int result = Math.factorial(n);

        // expected
        Assert.assertEquals(3628800, result);
    }

    @Test
    public void testFactorialOfOne() {
        // is
        int n = 1;

        // then
        final int result = Math.factorial(n);

        // expected
        Assert.assertEquals(1, result);
    }
}
