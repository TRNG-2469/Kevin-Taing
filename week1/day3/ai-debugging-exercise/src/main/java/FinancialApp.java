public class FinancialApp {
    public static double computeScore(int totalScore, int divisor) {
        if (divisor == 0) {
            System.err.println("Error: divisor cannot be zero.");
            return 0.0; // Return default value for invalid input
        }
        return totalScore / divisor;
    }

    public static void main(String[] args) {
        System.out.println("Processing report...");
        double value = computeScore(100, 0);
        System.out.println("Calculated Value: " + value);
    }
}