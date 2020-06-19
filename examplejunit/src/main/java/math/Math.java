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

    public static int findMin(int [] numbers) {
        int min = Integer.MAX_VALUE;

        for(int number:numbers) {
            if(number < min) {
                min = number;
            }
        }
        return min;
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

    public static int multiplyNumbers(int [] numbers) {
        int result = 1;

        for(int number:numbers) {
            result *= number;
        }
        return result;
    }

    public static int factorial(int n) {
        int result = 1;

        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
