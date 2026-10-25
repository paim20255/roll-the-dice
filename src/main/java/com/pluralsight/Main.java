package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        for (int i = 1; i <=100; i++) {
            int roll1 = dice.roll();
            int roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " and " + roll2 + " (sum " + sum + ")");

            if (sum == 2) {
                count2++;
            } else if (sum == 4) {
                count4++;
            } else if (sum == 6) {
                count6++;
            } else if (sum == 7) {
                count7++;
            }
        }

        System.out.println();
        System.out.println("Sum of 2 was rolled " + count2 + " times");
        System.out.println("Sum of 4 was rolled " + count4 + " times");
        System.out.println("Sum of 6 was rolled " + count6 + " times");
        System.out.println("Sum of 7 was rolled " + count7 + " times");
        }

    }





