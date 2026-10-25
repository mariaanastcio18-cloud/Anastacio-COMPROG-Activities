/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprog_activities;

/**
 *
 * @author maria
 */

import java.util.Arrays;

public class week5 {

    // 1. Favorite Things Array
    static void favoriteThingsArray() {
        System.out.println("\n===== FAVORITE THINGS ARRAY =====");

        String[] favorites = {
            "Strawberry",
            "Pink",
            "Kuromi",
            "Takoyaki",
            "Thailand"
        };

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total favorites: " + favorites.length);
    }

    // 2. Class Statistics Calculator
    static void classStatisticsCalculator() {
        System.out.println("\n===== CLASS STATISTICS =====");

        int[] scores = {90, 85, 75, 88, 80, 79, 94, 92};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int score : scores) {
            sum += score;

            if (score > highest) {
                highest = score;
            }

            if (score < lowest) {
                lowest = score;
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("Sum of scores: " + sum);
        System.out.printf("Average score: %.2f%n", average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }

    // 3. Search and Sort Mini Tool
    static void searchSortMiniTool() {
        System.out.println("\n===== SEARCH AND SORT MINI TOOL =====");

        int[] scores = {85, 90, 78, 92, 88, 76, 95, 84};
        int target = 92;
        int foundIndex = -1;

        // Linear Search
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        // Display Search Result
        if (foundIndex != -1) {
            System.out.println(
                "Score " + target + " found at index: " + foundIndex
            );
        } else {
            System.out.println(
                "Score " + target + " was not found."
            );
        }

        // Copy the Original Array
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        // Sort the Copied Array
        Arrays.sort(sortedScores);

        // Display Both Arrays
        System.out.println(
            "Original Scores: " + Arrays.toString(scores)
        );
        System.out.println(
            "Sorted Scores: " + Arrays.toString(sortedScores)
        );
    }

    // 4. Class Ranking System
    static class Student {
        String name;
        int[] quizzes;

        // Constructor
        public Student(String name, int q1, int q2, int q3, int q4) {
            this.name = name;
            quizzes = new int[]{q1, q2, q3, q4};
        }

        // Calculate Average Score
        public double getAverage() {
            int total = 0;

            for (int score : quizzes) {
                total += score;
            }

            return (double) total / quizzes.length;
        }
    }

    static void classRankingSystem() {
        System.out.println("\n===== CLASS RANKING SYSTEM =====");

        // Sample students and quiz scores
        Student[] students = {
            new Student("Student A", 90, 85, 88, 92),
            new Student("Student B", 80, 84, 79, 87),
            new Student("Student C", 95, 93, 91, 96)
        };

        // Sort students by average, highest to lowest
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getAverage()
                        < students[j + 1].getAverage()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Display Rankings
        for (int i = 0; i < students.length; i++) {
            System.out.printf(
                "%d. %s - Average: %.2f%n",
                i + 1,
                students[i].name,
                students[i].getAverage()
            );
        }
    }

    // Main Method
    public static void main(String[] args) {
        favoriteThingsArray();
        classStatisticsCalculator();
        searchSortMiniTool();
        classRankingSystem();

        System.out.println("\n===== ALL ACTIVITIES COMPLETED =====");
    }
}
