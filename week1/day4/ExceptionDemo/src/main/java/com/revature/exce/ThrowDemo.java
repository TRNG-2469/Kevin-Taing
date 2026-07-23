package com.revature.exce;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch(InvalidAgeException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 18) {
            // System.out.println("You are too young");
            throw new InvalidAgeException("You are too young to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}
