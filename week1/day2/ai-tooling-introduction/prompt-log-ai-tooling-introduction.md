# AI Prompt Log: AI Tooling Introduction

## 1. Initial Attempt
- **Context**: Split a string by comma, convert each item to an integer, and return the array of numbers.
- **Prompt**: "Write a Java method to split a string by comma, convert each item to an integer, 
and return the array of numbers."
- **Generated Code**:
```java
public static int[] parseNumbers(String input) {
    String[] parts = input.split(",");
    int[] nums = new int[parts.length];
    for (int i = 0; i < parts.length; i++) {
        nums[i] = Integer.parseInt(parts[i]);
    }
    return nums;
}
```

## 2. Critique and Evaluation
- **Security Check**: Crashes on null.
- **Logic Constraints**: Crashes on a written out number or empty items
- **Redundancy/Complexity**: The method is overly complex and could be simplified.

## 3. Refined Attempt
- **Revised Prompt**: "The parseNumbers method has three issues: 1) It crashes with a NullPointerException if the input 
is null. 2) It crashes if the user enters a written out number. 3) It crashes on empty items. Please update the method: 
return an empty array if null/empty, handle written out numbers, and skip empty items."
- **Refined Code**: 
```java
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
```

## Final Evaluation
The refined code is safer and more production-ready because it handles null inputs, skips invalid entries, 
and avoids crashing on empty or malformed input. It also provides warnings for skipped entries, improving user feedback.