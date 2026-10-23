package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        for (int i = 0; i <=100; i++) {
            int roll1 = dice.roll();
            int roll2 = dice.roll();
            int sum = roll1 + roll2;
            System.out.println(i);
            System.out.println(sum);
            System.out.println("Roll " + i + ":" + roll1 + " - " + roll2 + "Sum: " + sum);
        }

    }


}


