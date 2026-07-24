package exercise;

public class StringCalculator {
    public int add(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] tokens = input.split(",");
        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token.trim());
        }
        return sum;
    }

    public int mul(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] tokens = input.split(",");
        int product = Integer.parseInt(tokens[0].trim());
        for (int x = 1; x < tokens.length; x++) {
            product *= Integer.parseInt(tokens[x].trim());
        }
        return product;
    }

    public double div(String input) {
        if(input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        if (input.trim().isEmpty()) {
            return 0;
        }
        String[] tokens = input.split(",");
        double product = Double.parseDouble(tokens[0].trim());
        for (int x = 1; x < tokens.length; x++) {
                double divisor = Double.parseDouble(tokens[x].trim());
                if (divisor == 0) {
                    throw new IllegalArgumentException("Division by zero is undefined.");
                }
                product = product / divisor;
        }
        return product;
    }
}