public class StringProcessor {

    public static String reverse(String input) {
        if (input == null) {
            return "";
        }

        String output = "";

        for(int x = input.length() - 1; x >= 0; x--) {
            output += input.charAt(x);
        }

        return output;
    }

    public static int countVowels(String input) {
        if (input == null) {
            return 0;
        }

        String vowels = "aeiouAEIOU";
        int count = 0;

        for(int x = 0; x < input.length(); x++) {
            char c = input.charAt(x);
            if(vowels.contains("" + c)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String lowercase = input.toLowerCase();
        String spaceless = "";

        for(int x = 0; x < input.length(); x++) {
            if(lowercase.charAt(x) != ' ') {
                spaceless += lowercase.charAt(x);
            }
        }
        return spaceless.equals(reverse(spaceless));
    }
}
