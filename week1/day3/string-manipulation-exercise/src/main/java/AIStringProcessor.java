public class AIStringProcessor {

    /**
     * Reverses a given string
     * @param str the string to reverse
     * @return the reversed string
     */
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Counts the number of vowels in a given string
     * @param str the string to count vowels from
     * @return the count of vowels (case-insensitive)
     */
    public static int countVowels(String str) {
        if (str == null) {
            return 0;
        }
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if a given string is a palindrome
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
