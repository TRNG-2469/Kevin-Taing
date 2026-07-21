public class ArrayMath {

    /**
     * Calculates the average of an array of integers.
     * Safely returns 0.0 if the array is null or empty, and preserves decimal precision.
     */
    public static double findAverage(int[] arr) {
        // 1. Guard Check: Handle null or empty arrays safely
        if (arr == null || arr.length == 0) {
            System.out.println("Warning: Input array is null or empty. Returning 0.0");
            return 0.0;
        }

        // Use long for sum to prevent integer overflow on large arrays
        long sum = 0;
        for (int value : arr) {
            sum += value;
        }

        // 2. Cast sum to double to ensure double division is executed
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        // Verification checks
        int[] scores = {5, 6};
        System.out.println("Average: " + findAverage(scores)); // Prints 5.5 (Correct!)

        System.out.println("Empty check: " + findAverage(new int[0])); // Prints 0.0
        System.out.println("Null check: " + findAverage(null)); // Prints 0.0
    }
}