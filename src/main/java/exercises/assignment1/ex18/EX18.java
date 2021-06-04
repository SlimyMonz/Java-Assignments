/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment1.ex18;

import java.util.InputMismatchException;
import java.util.Scanner;


public class EX18 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double temp = 0;
        boolean bool;
        String input;
        String chooseConv = "Enter C to convert to Celsius, F to convert to Fahrenheit: ";
        String choice = ("Your choice: %s\n");
        String pleaseEnter = ("Please enter the temperature in %s: ");
        String theTempIn = ("The temperature in %s is %d.\n");

        do {

            System.out.print(chooseConv);
            input = sc.nextLine();

            if (input.equals("C") || input.equals("c")) {
                System.out.printf(choice, input);
                do {
                    bool = true;
                    System.out.printf(pleaseEnter, "Fahrenheit");
                    try {
                        temp = sc.nextDouble();
                    } catch (InputMismatchException error) {
                        System.out.println(error + ": \"MUST BE A NUMBER\"");
                        bool = false;
                    }
                    sc.nextLine();
                } while(!bool);

                System.out.printf(theTempIn, "Celsius", ((int) ((temp-32) * (5/9.f))));

            } else if (input.equals("F") || input.equals("f")) {
                System.out.printf(choice, input);
                do {
                    bool = true;
                    System.out.printf(pleaseEnter, "Celsius");
                    try {
                        temp = sc.nextDouble();
                    } catch (InputMismatchException error) {
                        System.out.println(error + ": \"MUST BE A NUMBER\"");
                        bool = false;
                    }
                    sc.nextLine();
                } while(!bool);

                System.out.printf(theTempIn, "Fahrenheit", ((int) ((temp*(9/5.f))+32)));

            } else {
                System.out.println("INVALID! Only enter C or F!");
                bool = false;
            }

        } while (!bool);
    }
}
