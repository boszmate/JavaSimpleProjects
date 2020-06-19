package math;

import org.junit.Assert;
import org.junit.Test;

public class MathMinTest {
    @Test
    public void testFindMinInPositiveNumbers() {
        // is
        int [] numbers = {1, 2, 5, 23, 67, 24, 103};

        // then
        final int result = Math.findMin(numbers);

        // expected
        Assert.assertEquals(1, result);
    }

    @Test
    public void testFindMinInNegativeNumbers() {
        // is
        int [] numbers = {1, -2, -5, -23, -9, 24, 13};

        // then
        final int result = Math.findMin(numbers);

        // expected
        Assert.assertEquals(-23, result);
    }
}
