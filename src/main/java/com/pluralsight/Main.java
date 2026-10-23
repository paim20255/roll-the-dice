package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1 = dice.roll();
        int roll2 = dice.roll();


       // System.out.println(dice .roll());
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        for (int i = 1; i <=100; i++) {
            System.out.println(i);
        }

    }


}


