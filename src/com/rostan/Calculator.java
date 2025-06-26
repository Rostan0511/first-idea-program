package com.rostan;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        char op;

        // Prompt until the user enters 'x' or 'X'
        while (true) {
            System.out.println("Enter the operator (+, -, *, /) or 'x' to exit:");
            op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Enter two numbers:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            switch (op) {
                case '+' -> {
                    ans = num1 + num2;
                    System.out.println("Result: " + ans);
                }
                case '-' -> {
                    ans = num1 - num2;
                    System.out.println("Result: " + ans);
                }
                case '*' -> {
                    ans = num1 * num2;
                    System.out.println("Result: " + ans);
                }
                case '/' -> {
                    if (num2 != 0) {
                        ans = num1 / num2;
                        System.out.println("Result: " + ans);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                }
                default -> System.out.println("Invalid operator!");
            }
        }

        sc.close();
    }
}
