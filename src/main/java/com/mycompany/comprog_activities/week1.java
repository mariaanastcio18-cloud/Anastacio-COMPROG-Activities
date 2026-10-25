/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comprog_activities;

/**
 *
 * @author maria
 */
public class week1 {

    public static void main(String[] args) {

        //BASIC: PERSONAL PROFILE PRINTER
        System.out.println("===== BASIC: PERSONAL PROFILE PRINTER =====");

        String fullName = "Maria Michaela F. Anastacio";
        int age = 19;
        double height = 15.8;
        char initial = 'F';
        boolean studentStatus = true;

        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Initial: " + initial);
        System.out.println("Student Status: " + studentStatus);

        // INTERMEDIATE: TYPE SAFE SHOPPING CENTER
        System.out.println("\n===== INTERMEDIATE: TYPE SAFE SHOPPING CENTER =====");

        int quantity = 5;
        double unitPrice = 67.69;
        String storeName = "Maria Store";

        double totalCost = quantity * unitPrice;

        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);

        // Total cost uses double because it can contain decimals.


        // ==========================================
        // ADVANCED: UNIT CASTING CONVERTER
        // ==========================================

        System.out.println("\n===== ADVANCED: UNIT CASTING CONVERTER =====");

        double centimeters = 300.95;

        System.out.println("Unit Conversion: Centimeters to Meters");
        System.out.println("Total Centimeters: " + centimeters + " cm");

        int totalCm = (int) centimeters;
        int meters = totalCm / 100;
        int remainingCm = totalCm % 100;

        System.out.println("Whole Meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingCm);

        // Implicit Widening Cast
        System.out.println("\nImplicit Widening Cast");

        int intValue = 150;
        double doubleValue = intValue;

        System.out.println("Original int value: " + intValue);
        System.out.println("Converted to double: " + doubleValue);

        // Explicit Narrowing Cast
        System.out.println("\nExplicit Narrowing Cast");

        double preciseMeasurement = 50.72;
        int wholeNumber = (int) preciseMeasurement;

        System.out.println("Original double value: " + preciseMeasurement);
        System.out.println("After cast to int: " + wholeNumber);

        // int widens automatically to double.
        // Casting double to int removes the decimal part.
        
        // ==========================================
        // EXPERT: OVERFLOW REFERENCE INVESTIGATOR
        // ==========================================

        // PART 1: BYTE OVERFLOW
        System.out.println("\n===== EXPERT: OVERFLOW REFERENCE INVESTIGATOR =====");

        byte myByte = 127;
        System.out.println("Original byte value: " + myByte);

        myByte++;

        System.out.println("After increment (overflow): " + myByte);

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        
        // == compares object references.
        System.out.println("\nReference comparisons using ==:");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str2 == str3: " + (str2 == str3));
        
        // equals() compares string contents.
        System.out.println("\nContent comparisons using equals():");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str2.equals(str3): " + str2.equals(str3));

        int[] originalArray = {10, 20, 30, 40, 50};
        int[] secondReference = originalArray;

        System.out.println(
            "Before change - originalArray[1]: " + originalArray[1]
        );

        System.out.println(
            "Before change - secondReference[1]: " + secondReference[1]
        );

        secondReference[1] = 999;
        System.out.println(
            "\nAfter change - originalArray[1]: " + originalArray[1]
        );

        System.out.println(
            "After change - secondReference[1]: " + secondReference[1]
        );
        // Both references point to the same array.
        // Changing the array through one reference affects the other.
    }
}
