package com.revature.exce;

import java.util.Scanner;

public class DemoEx01 {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = input.nextLine();

        try {
            System.out.println("Please enter you age: ");
            age = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for your age.");
        }
    }
}
