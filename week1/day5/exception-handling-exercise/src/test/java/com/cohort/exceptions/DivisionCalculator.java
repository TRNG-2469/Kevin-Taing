package com.cohort.exceptions;

public class DivisionCalculator {
    public static int divide(String numeratorStr, String denominatorStr) throws InvalidInputException {
        if(numeratorStr == null || numeratorStr.trim().isEmpty() || denominatorStr == null || denominatorStr.trim().isEmpty()) {
            throw new InvalidInputException("Input arguments cannot be null or empty.");
        }

        int numerator;
        int denominator;

        try {
            numerator = Integer.parseInt(numeratorStr);
            denominator = Integer.parseInt(denominatorStr);
        } catch(NumberFormatException e) {
            throw new InvalidInputException("Input must be valid integers. Parsing failed.");
        }

        try {
            int result = numerator / denominator;
            return result;
        } catch(ArithmeticException e) {
            throw new InvalidInputException("Division by zero is mathematically undefined.");
        }
    }

    public static void main(String[] args) {
        try {
            divide("100", "5");
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("[CALCULATOR] Execution cycle complete.");
        }

        try {
            divide("100", "0");
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("[CALCULATOR] Execution cycle complete.");
        }

        try {
            divide("abc", "5");
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("[CALCULATOR] Execution cycle complete.");
        }

        try {
            divide(null, "5");
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("[CALCULATOR] Execution cycle complete.");
        }
    }
}
