/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX17 {

    public static final double maxBloodAlcohol = 0.08;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double alcoholPercent;
        double weight;  // in pounds
        double aDR;
        int ounces;
        int hours = -1;

        do {
            System.out.print("How many drinks did you have?: ");
            try {
                ounces = ((int) (Math.ceil(sc.nextDouble() * 8)));
                if (ounces < 0) {
                    System.out.println("Cannot have a negative number!");
                }
            } catch (InputMismatchException error) {
                System.out.println(error + ": \"MUST BE A NUMBER\"");
                ounces = -1;
            }
            sc.nextLine(); // prevents issues, idk why it happens!

        } while(ounces < 0);


        do {
            System.out.print("Did you have hard liquor (vodka/shots/tequila)? (Enter Y or N): ");
            //This currently assumes all drinks are shots if you enter Y.
            String input = sc.nextLine();

            if (input.equals("Y")) {
                alcoholPercent = 0.40;
            } else if (input.equals("N")) {
                alcoholPercent = 0.05;
            } else {
                System.out.println("INVALID! Only enter Y or N!");
                alcoholPercent = 0;
            }

        } while (alcoholPercent == 0);


        do {
            System.out.print("What is your weight? (in pounds): ");
            try {
                weight = (int) Math.floor(sc.nextDouble());
                if (weight < 10) {
                    System.out.println("INVALID WEIGHT! (If you're a baby you should not be drinking!)");
                }
            } catch (InputMismatchException error) {
                System.out.println(error + ": \"MUST BE A NUMBER\"");
                weight = 0;
            }
            sc.nextLine(); // again, prevents issues ???

        } while(weight < 10);


        do {
            System.out.print("How many hours since your last drink? ");
            try {
                hours = (int) Math.floor(sc.nextDouble());
                if (hours < 0) {
                    System.out.println("Cannot have a negative number!");
                }
            } catch (InputMismatchException error) {
                System.out.println(error + ": \"MUST BE A NUMBER\"");
            }
            sc.nextLine(); //you know what's up
        } while(hours < 0);

        do {
            System.out.print("What is your birth-assigned sex? (Enter M or F): ");
            String input = sc.nextLine();

            if (input.equals("M")) {
                aDR = 0.73;
            } else if (input.equals("F")) {
                aDR = 0.66;
            } else {
                System.out.println("INVALID! Only enter Y or N!");
                aDR = 0;
            }
        } while (aDR == 0);

        double bloodAlcohol =  ((ounces * alcoholPercent) * 5.14 / weight * aDR) - (0.015 * hours);

        if (bloodAlcohol < 0) bloodAlcohol = 0;

        System.out.printf("Your BAC is %.2f\n", bloodAlcohol);

        System.out.printf("It is %s legal for you to drive.", ((bloodAlcohol >= maxBloodAlcohol) ? "not" : "\b"));
        if (bloodAlcohol > 0) System.out.print(" Drive responsibly.");

    }
}
