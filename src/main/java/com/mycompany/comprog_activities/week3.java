/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprog_activities;

/**
 *
 * @author maria
 */
public class week3 {

    public static void main(String[] args) {

        simpleGradeClassifier();
        multiTierDiscountSystem();
        nestedLoginValidator();
        atmTransactionAuthorizer();

    }

    // 1. Simple Grade Classifier
    public static void simpleGradeClassifier() {
        System.out.println("\n===== SIMPLE GRADE CLASSIFIER =====");

        int score = 85;

        if (score >= 60) {
            System.out.println("Score: " + score);
            System.out.println("PASSED");
        } else {
            System.out.println("Score: " + score);
            System.out.println("FAILED");
        }

        score = 45;

        if (score >= 60) {
            System.out.println("Score: " + score);
            System.out.println("PASSED");
        } else {
            System.out.println("Score: " + score);
            System.out.println("FAILED");
        }
    }

    // 2. Multi-Tier Discount System
    public static void multiTierDiscountSystem() {
        System.out.println("\n===== MULTI-TIER DISCOUNT SYSTEM =====");

        double purchaseAmount = 2500.0;
        double discountPercent;
        String discountTier;

        if (purchaseAmount >= 5000) {
            discountTier = "15% Discount";
            discountPercent = 0.15;
        } else if (purchaseAmount >= 3000) {
            discountTier = "10% Discount";
            discountPercent = 0.10;
        } else if (purchaseAmount >= 1000) {
            discountTier = "5% Discount";
            discountPercent = 0.05;
        } else {
            discountTier = "0% Discount";
            discountPercent = 0.00;
        }

        double finalPrice =
                purchaseAmount - (purchaseAmount * discountPercent);

        System.out.println("Purchase Amount: pesos" + purchaseAmount);
        System.out.println("Discount Tier: " + discountTier);
        System.out.println("Final Price: pesos" + finalPrice);
        System.out.println("----------------------------------------");
    }

    // 3. Nested Login Validator
    public static void nestedLoginValidator() {
        System.out.println("\n===== NESTED LOGIN VALIDATOR =====");

        String correctUsername = "admin";
        String correctPassword = "pass123";
        boolean accountLocked = false;

        String inputUsername = "admin";
        String inputPassword = "pass123";

        if (inputUsername.equals(correctUsername)) {
            if (inputPassword.equals(correctPassword)) {
                if (!accountLocked) {
                    System.out.println(
                        "Login Successful! Welcome, "
                        + inputUsername + "!"
                    );
                } else {
                    System.out.println(
                        "Login Failed: Your account is locked. "
                        + "Please contact support."
                    );
                }
            } else {
                System.out.println("Login Failed: Incorrect password.");
            }
        } else {
            System.out.println("Login Failed: Username not found.");
        }
    }

    // 4. ATM Transaction Authorizer
    public static void atmTransactionAuthorizer() {
        System.out.println("\n===== ATM TRANSACTION AUTHORIZER =====");

        String atmUsername = "emem";
        int accessPin = 1619;

        String enteredUsername = "emem";
        int enteredPin = 1619;

        double balance = 15000.0;
        double amountToWithdraw = 500.0;

        boolean isAccountLocked = false;
        String accountTier;
        double feeRate;

        if (!enteredUsername.equals(atmUsername)) {
            System.out.println("DENIED - Username not recognized");

        } else if (enteredPin != accessPin) {
            System.out.println("DENIED - Invalid ATM PIN");

        } else if (isAccountLocked) {
            System.out.println("DENIED - Account is Locked");

        } else if (amountToWithdraw > 10000) {
            System.out.println(
                "DENIED - Daily withdrawal limit is 10000"
            );

        } else {

            // Determine account tier
            if (balance < 5000) {
                accountTier = "Bronze";
            } else if (balance < 15000) {
                accountTier = "Silver";
            } else if (balance < 50000) {
                accountTier = "Gold";
            } else {
                accountTier = "Platinum";
            }

            // Determine transaction fee
            switch (accountTier) {
                case "Bronze":
                    feeRate = 0.02;
                    break;

                case "Silver":
                    feeRate = 0.15;
                    break;

                case "Gold":
                    feeRate = 0.01;
                    break;

                case "Platinum":
                    feeRate = 0.0;
                    break;

                default:
                    feeRate = 0.0;
                    break;
            }

            double fee = amountToWithdraw * feeRate;
            double totalDeduction = amountToWithdraw + fee;

            System.out.println("Account Tier: " + accountTier);
            System.out.println(
                "Transaction Fee: " + (feeRate * 100) + "%"
            );
            System.out.println("------------------------------");

            // Check sufficient funds
            if (balance >= totalDeduction) {
                balance = balance - totalDeduction;

                System.out.println("APPROVED");
                System.out.println(
                    "Withdraw Amount: " + amountToWithdraw
                );
                System.out.println("Fee Deducted: " + fee);
                System.out.println("Total Deducted: " + totalDeduction);
                System.out.println("New Balance: " + balance);

            } else {
                System.out.println("DENIED - Insufficient funds");
            }
        }
    }
}
