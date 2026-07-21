public class NameParser {

    /**
     * Safely extracts the first letter of each name component to form initials.
     * Handles nulls, single names, and multiple contiguous spaces.
     *
     * @param name The input full name
     * @return A capitalized string of initials
     */
    public static String getInitials(String name) {
        // 1. Handle Null or Empty inputs safely
        if (name == null || name.strip().isEmpty()) {
            return "";
        }

        // 2. Use regular expression split to handle multiple spaces: "\\s+"
        // This splits by any sequence of whitespace characters, avoiding empty array elements.
        String[] parts = name.strip().split("\\s+");
        StringBuilder initials = new StringBuilder();

        for (String part : parts) {
            // 3. Double-check that the part is not empty
            if (!part.isEmpty()) {
                // Append the first character, converted to uppercase
                initials.append(Character.toUpperCase(part.charAt(0)));
            }
        }

        return initials.toString();
    }

    public static void main(String[] args) {
        // Verification checks
        System.out.println("Standard check: " + getInitials("John Doe")); // "JD"
        System.out.println("Middle name check: " + getInitials("John Fitzgerald Kennedy")); // "JFK"
        System.out.println("Multiple spaces: " + getInitials("  Alice   Smith  ")); // "AS"
        System.out.println("Single name: " + getInitials("Zendaya")); // "Z"
        System.out.println("Null check: '" + getInitials(null) + "'"); // ""
    }
}