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

public class week4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        numberAndSquarePrinter();
        sumUntilSentinelValue(input);
        patternGeneratorWithEarlyExit(input);
        warehouseInventoryScanner(input);

        System.out.println("\nAll activities completed!");

        input.close();
    }

    // BASIC: NUMBER AND SQUARE PRINTER
    public static void numberAndSquarePrinter() {
        System.out.println("\n===== NUMBER AND SQUARE PRINTER =====");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i + " | Square: " + (i * i));
        }

        System.out.println("\nChanged loop bound to 20:");

        for (int i = 1; i <= 20; i++) {
            System.out.println("Number: " + i + " | Square: " + (i * i));
        }
    }

    // INTERMEDIATE: SUM UNTIL SENTINEL VALUE
    public static void sumUntilSentinelValue(Scanner input) {
        System.out.println("\n===== SUM UNTIL SENTINEL VALUE =====");

        int total = 0;
        int number;

        System.out.println("Enter numbers to sum. Enter -1 to stop.");

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");

            while (!input.hasNextInt()) {
                System.out.print("Invalid input! Enter an integer: ");
                input.next();
            }

            number = input.nextInt();

            if (number == -1) {
                break;
            }

            total += number;
        }

        System.out.println("Final total: " + total);
    }

    //ADVANCED: PATTERN GENERATOR WITH EARLY EXIT
    public static void patternGeneratorWithEarlyExit(Scanner input) {
        System.out.println("\n===== PATTERN GENERATOR WITH EARLY EXIT =====");

        System.out.print("Enter size of pattern: ");
        int size = readInteger(input);

        if (size < 1) {
            System.out.println("Pattern size must be at least 1.");
            return;
        }

        System.out.print("Enter column number to BREAK at: ");
        int breakAt = readInteger(input);

        System.out.print("Enter row number to SKIP (CONTINUE): ");
        int skipRow = readInteger(input);

        for (int row = 1; row <= size; row++) {

            if (row == skipRow) {
                System.out.println("Row " + row + " - SKIPPED");
                continue; // CONTINUE: Skips the current iteration and proceeds to the next loop iteration.
            }

            for (int col = 1; col <= size; col++) {

                if (col == breakAt) {
                    break; // BREAK: Terminates the loop immediately when the target score is found.
                }

                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("\nDone!");
    }

    //EXPERT: WAREHOUSE INVENTORY SCANNER
    public static void warehouseInventoryScanner(Scanner input) {
        System.out.println("\n===== WAREHOUSE INVENTORY SCANNER =====");

        int[][] warehouse = {
            {50, 30, -1, 40, 70},
            {20, 80, 15, -1, 35},
            {-1, 45, 55, 25, 60}
        };

        int rows = warehouse.length;
        int cols = warehouse[0].length;
        int choice = 0;

        System.out.println("Warehouse Inventory:");
        displayInventory(warehouse);

        do {
            System.out.println("\n===== WAREHOUSE INVENTORY MENU =====");
            System.out.println("[1] View Total Inventory");
            System.out.println("[2] Find First Critical Shelf");
            System.out.println("[3] Restock Shelves");
            System.out.println("[0] Exit");
            System.out.print("Enter your choice: ");

            choice = readInteger(input);

            switch (choice) {

                case 1:
                    System.out.println("\n----- INVENTORY COUNT -----");

                    int totalItems = 0;
                    int damagedCount = 0;

                    for (int r = 0; r < rows; r++) {
                        for (int c = 0; c < cols; c++) {
                            if (warehouse[r][c] == -1) {
                                damagedCount++;
                                continue;
                            }

                            totalItems += warehouse[r][c];
                        }
                    }

                    System.out.println(
                        "Total items in warehouse: " + totalItems
                    );
                    System.out.println(
                        "Damaged shelves skipped: " + damagedCount
                    );
                    break;

                case 2:
                    System.out.println("\n----- FIND CRITICAL SHELF -----");

                    boolean foundCritical = false;
                    int criticalThreshold = 20;

                    outerLoop:
                    for (int r = 0; r < rows; r++) {
                        for (int c = 0; c < cols; c++) {

                            if (warehouse[r][c] != -1
                                    && warehouse[r][c] < criticalThreshold) {

                                System.out.println(
                                    "Critical shelf found at Row "
                                    + (r + 1)
                                    + ", Column " + (c + 1)
                                    + " - Items: " + warehouse[r][c]
                                );

                                foundCritical = true;
                                break outerLoop;
                            }
                        }
                    }

                    if (!foundCritical) {
                        System.out.println("No critical shelves found.");
                    }
                    break;

                case 3:
                    System.out.println("\n----- RESTOCK SHELF -----");

                    boolean doneRestocking = false;

                    while (!doneRestocking) {
                        System.out.print(
                            "Enter row (1-" + rows + ") or 0 to return: "
                        );

                        int rowSel = readInteger(input);

                        if (rowSel == 0) {
                            System.out.println("Returned to main menu.");
                            break;
                        }

                        if (rowSel < 1 || rowSel > rows) {
                            System.out.println("Invalid row! Try again.");
                            continue;
                        }

                        System.out.print(
                            "Enter column (1-" + cols + "): "
                        );

                        int colSel = readInteger(input);

                        if (colSel < 1 || colSel > cols) {
                            System.out.println("Invalid column! Try again.");
                            continue;
                        }

                        if (warehouse[rowSel - 1][colSel - 1] == -1) {
                            System.out.println(
                                "That shelf is DAMAGED - cannot restock."
                            );
                            continue;
                        }

                        System.out.print("Enter new item count: ");
                        int newCount = readInteger(input);

                        if (newCount < 0) {
                            System.out.println(
                                "Item count cannot be negative!"
                            );
                            continue;
                        }

                        warehouse[rowSel - 1][colSel - 1] = newCount;

                        System.out.println("Restocked successfully!");
                        displayInventory(warehouse);

                        doneRestocking = true;
                    }
                    break;

                case 0:
                    System.out.println("Exiting warehouse menu...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);
    }

    // Display the warehouse inventory
    public static void displayInventory(int[][] warehouse) {
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                System.out.print(warehouse[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Read an integer and reject non-integer input
    public static int readInteger(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.print("Invalid input! Enter a whole number: ");
            input.next();
        }

        return input.nextInt();
    }
}
