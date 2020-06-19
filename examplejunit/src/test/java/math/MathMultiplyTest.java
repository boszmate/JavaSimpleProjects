package math;

import org.junit.Assert;
import org.junit.Test;

public class MathMultiplyTest {
    @Test
    public void testMultiplyPositiveNumbers() {
        // is
        int [] numbers = {1, 2, 3};

        // then
        final int result = Math.multiplyNumbers(numbers);

        // expected
        Assert.assertEquals(6, result);
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        // is
        int [] numbers = {1, -2, 3};

        // then
        final int result = Math.multiplyNumbers(numbers);

        // expected
        Assert.assertEquals(-6, result);
    }

    @Test
    public void testMultiplyNumbersWithZero() {
        // is
        int [] numbers = {1, 2, 3, 0};

        // then
        final int result = Math.multiplyNumbers(numbers);

        // expected
        Assert.assertEquals(0, result);
    }
}
