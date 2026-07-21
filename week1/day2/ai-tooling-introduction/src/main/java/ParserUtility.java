public class ParserUtility {

    /**
     * Safely parses a comma-separated string of integers into an array.
     * Includes validations for null values, whitespaces, and parsing errors.
     */
    public static int[] parseNumbers(String input) {
        // 1. Guard Check: Handle null or empty input string safely
        if (input == null || input.strip().isEmpty()) {
            return new int[0]; // Return empty array instead of crashing
        }

        String[] parts = input.split(",");
        int[] nums = new int[parts.length];
        int validCount = 0;

        for (int i = 0; i < parts.length; i++) {
            try {
                // 2. Trim whitespaces around number entries
                String cleanPart = parts[i].strip();
                nums[validCount] = Integer.parseInt(cleanPart);
                validCount++;
            } catch (NumberFormatException e) {
                // 3. Catch parsing exceptions and log warnings instead of crashing
                System.out.println("Warning: Skipping invalid number entry: '" + parts[i] + "'");
            }
        }

        // 4. Resize array if any invalid entries were skipped
        if (validCount < nums.length) {
            int[] cleanedNums = new int[validCount];
            System.arraycopy(nums, 0, cleanedNums, 0, validCount);
            return cleanedNums;
        }

        return nums;
    }

    public static void main(String[] args) {
        // Test with safe and unsafe inputs
        int[] result1 = parseNumbers("10, 20 , 30, 40");
        System.out.println("Valid parse: " + java.util.Arrays.toString(result1)); // [10, 20, 30, 40]

        int[] result2 = parseNumbers("10, invalid_text, 30");
        System.out.println("Partial parse: " + java.util.Arrays.toString(result2)); // [10, 30]

        int[] result3 = parseNumbers(null);
        System.out.println("Null check parse: " + java.util.Arrays.toString(result3)); // []
    }
}