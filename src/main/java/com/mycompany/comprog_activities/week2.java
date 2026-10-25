/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprog_activities;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class week2 {

    public static void main(String[] args) {
        fourFunctionCalculator();
        compoundGrowthIncrementTracker();
        gradeThresholdChecker();
        precedencePuzzleSolver();
    }

    //BASIC: FOUR FUNCTION CALCULATOR
    public static void fourFunctionCalculator() {
        System.out.println("\n===== FOUR FUNCTION CALCULATOR =====");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division (/): " + ((double) num1 / num2));
            System.out.println("Modulus (%): " + (num1 % num2));
        } else {
            System.out.println("Division cannot be performed by zero.");
            System.out.println("Modulus cannot be performed by zero.");
        }
    }

    //INTERMEDIATE: COMPOUND GROWTH TRACKER
    public static void compoundGrowthIncrementTracker() {
        System.out.println("\n===== COMPOUND GROWTH TRACKER =====");

        double balance = 1000.0;

        System.out.println("Starting balance: " + balance);

        balance += 500.0;
        System.out.println("After += 500.0: " + balance);

        balance *= 1.10;
        System.out.println("After *= 1.10: " + balance);

        balance -= 200.0;
        System.out.println("After -= 200.0: " + balance);

        //Postfix vs Prefix
        int count = 5;

        System.out.println("count++ in print: " + count++);
        System.out.println("After count++: " + count);

        count = 5;

        System.out.println("++count in print: " + (++count));
        System.out.println("After ++count: " + count);
    }

    //ADVANCED: GRADE THRESHOLD CHECKER
    public static void gradeThresholdChecker() {
        System.out.println("\n===== GRADE THRESHOLD CHECKER =====");

        double grade = 89;
        int absences = 3;

        boolean isPassed =
                (grade >= 75 && absences >= 3) || (grade >= 90);

        System.out.println("Average Grade: " + grade);
        System.out.println("Absences: " + absences);
        System.out.println("Result: " + isPassed);
    }

    // EXPERT: PRECEDENCE PUZZLE SOLVER
    public static void precedencePuzzleSolver() {
        System.out.println("\n===== PRECEDENCE PUZZLE SOLVER =====");

        int a = 10, b = 3;

        System.out.println("This is addition: " + (a + b));
        System.out.println("This is subtraction: " + (a - b));
        System.out.println("This is multiplication: " + (a * b));
        System.out.println("This is division: " + (a / b));
        System.out.println("This is remainder (modulus): " + (a % b));

        System.out.println("========");

        int whole = 7;
        double decimal = 2.0;
        double result = whole / decimal;

        System.out.println(result);

        System.out.println("============");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("This is Max Range Value of INTEGER: " + max);
        System.out.println("This is Min Range Value of INTEGER: " + min);

        System.out.println("\n====== Precedence Puzzle Solver ======");

        System.out.println("1: " + (5 + 3 * 4 > 10));
        System.out.println("2: " + (true || false && false));

        int x = 7;
        System.out.println("3: " + (++x * 3));
    }
}
