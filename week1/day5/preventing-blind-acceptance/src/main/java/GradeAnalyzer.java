public class GradeAnalyzer {

    /**
     * Safely calculates the average of a double array.
     * Verified against Null references, Array Boundary overflows, and division by zero.
     */
    public static double getAverage(double[] grades) {
        // 1. Guard check: Null reference check
        if (grades == null) {
            System.out.println("Warning: Grades array reference is null. Returning 0.0.");
            return 0.0;
        }

        // 2. Guard check: Division-by-zero check (Empty array)
        if (grades.length == 0) {
            System.out.println("Warning: Grades array is empty. Returning 0.0.");
            return 0.0;
        }

        double sum = 0.0;
        // 3. Off-by-one boundary correction (changed <= to <)
        for (int i = 0; i < grades.length; i++) {
            // Optional: validate scores are positive numbers
            if (grades[i] >= 0.0) {
                sum += grades[i];
            }
        }

        return sum / grades.length;
    }

    public static void main(String[] args) {
        // Sandboxed testing boundary inputs
        System.out.println("Average of null:  " + getAverage(null));     // Safe: returns 0.0
        System.out.println("Average of empty: " + getAverage(new double[0])); // Safe: returns 0.0

        double[] realGrades = {85.0, 90.0, 95.0};
        System.out.println("Real average:     " + getAverage(realGrades)); // Safe: returns 90.0
    }
}