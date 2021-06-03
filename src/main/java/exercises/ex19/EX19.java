/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX19 {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        double getWeight = getNumber("weight (lbs): ");
        double getHeight = getNumber("height (inches): ");

        yourBMI(getWeight, getHeight); // runs the actual if-else and prints

    }


    public static double getNumber(String value) {
        boolean bool;
        double input = -1;
        do {
            bool = true;
            System.out.printf("Enter your %s", value);

            try {
                input = Double.parseDouble(sc.nextLine());
            } catch (InputMismatchException error) {
                System.out.println(error + ": \"MUST BE A NUMBER\"");
                bool = false;
            }

            if (input <= 20) { // weight and height cannot be under 20lbs and 20inches
                System.out.println("INVALID NUMBER!");
                bool = false;
            }

        } while(!bool);

        return input;
    }


    public static void yourBMI(double weight, double height) {

        double bmi = (weight/(height*height)) * 703;

        String yourBMI = ("Your BMI is %.1f.\n");

        if (bmi <= 18.5) {
            System.out.printf(yourBMI, bmi);
            System.out.print("You are underweight and should talk to a dietitian!");
        } else if (bmi < 25) {
            System.out.printf(yourBMI, bmi);
            System.out.print("You are within the ideal weight range!");
        } else {
            System.out.printf(yourBMI, bmi);
            System.out.print("You are overweight. Do not buy weight loss pills from a local Facebook mom.");
        }
    }

}
