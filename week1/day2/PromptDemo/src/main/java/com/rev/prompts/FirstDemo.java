package com.rev.prompts;

public class FirstDemo {

    public static int[] splitAndConvertToInts(String input) {
        if (input == null || input.isBlank()) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            String value = parts[i].trim();
            if (value.isEmpty()) {
                throw new NumberFormatException("Empty value at index " + i);
            }
            numbers[i] = Integer.parseInt(value);
        }

        return numbers;
    }
}
