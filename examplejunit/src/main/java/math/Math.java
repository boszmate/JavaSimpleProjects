package math;

public class Math {
    public static int findMax(int [] numbers) {
        int max = Integer.MIN_VALUE;

        for(int number:numbers) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int calculateSum(int [] numbers) {
        int sum = 0;

        for(int number:numbers) {
            sum += number;
        }
        return sum;
    }

    public static float calculateAverage(int [] numbers) {
        return Math.calculateSum(numbers) / (float)numbers.length;
    }
}
