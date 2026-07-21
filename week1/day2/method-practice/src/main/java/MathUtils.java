public class MathUtils {
    // Returns the product of all positive integers less than or equal to n. Returns 1 if n <= 1
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Returns true if n is prime, and false otherwise. (Check if n is
    // divisible by any integer between 2 and Math.sqrt(n)).
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Returns the temperature converted to Fahrenheit using formula: (celsius * 9/5) + 32.
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Returns the largest integer value in the array. Return 0 (or print warning) if array is empty or null.
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return 0;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Overloads findMax. Returns the largest double value in the array.
    public static double findMax(double[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return 0.0;
        }
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + MathUtils.factorial(5));
        System.out.println("Factorial of 1: " + MathUtils.factorial(1));
        System.out.println("Factorial of 8: " + MathUtils.factorial(8));
        System.out.println("Factorial of 0: " + MathUtils.factorial(0));

        System.out.println("isPrime of 0: " + MathUtils.isPrime(0));
        System.out.println("isPrime of 1: " + MathUtils.isPrime(1));
        System.out.println("isPrime of 2: " + MathUtils.isPrime(2));
        System.out.println("isPrime of 3: " + MathUtils.isPrime(3));
        System.out.println("isPrime of 4: " + MathUtils.isPrime(4));

        System.out.println("Fahrenheit of 64: " + MathUtils.celsiusToFahrenheit(64));
        System.out.println("Fahrenheit of 0: " + MathUtils.celsiusToFahrenheit(0));
        System.out.println("Fahrenheit of -20: " + MathUtils.celsiusToFahrenheit(-20));
        System.out.println("Fahrenheit of 100: " + MathUtils.celsiusToFahrenheit(100));

        System.out.println("Max of [1, 2, 3, 4, 5]: " + MathUtils.findMax(new int[]{1, 2, 3, 4, 5}));
        int[] tempArray = null;
        System.out.println("Max of []: " + MathUtils.findMax(tempArray));

        System.out.println("Max of [1.1, 2.2, 3.3, 4.4, 5.5]: " + MathUtils.findMax(new double[]{1.1, 2.2, 3.3, 4.4, 5.5}));
    }
}
