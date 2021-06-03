/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex10;

import java.util.Scanner;

public class EX10 {

    public static Scanner sc = new Scanner(System.in);

    public static String enterPrice = "Enter the price of item ";
    public static String enterQuantity = "Enter the quantity of item ";

    public static double tax = 0.07;


    public static void main(String[] args) {

        double totalPrice = 0, calcTotal;
        int i = 1;
        String input1, input2;
        boolean bool = true;

        do {

            try {
                do {
                    System.out.print(enterPrice + i + ": $");
                    input1 = sc.nextLine();
                } while (input1.equals("0"));

                do {
                    System.out.print(enterQuantity + i + ": ");
                    input2 = sc.nextLine();
                } while (input2.equals("0"));

                calcTotal = (Double.parseDouble(input1) * Integer.parseInt(input2));

                totalPrice += calcTotal;
                i++;

            } catch (NumberFormatException nfe) {
                System.out.println("Order complete!");
                bool = false;
            }

        } while (bool);

        System.out.printf("\nThe price before tax is: $%.2f\n", totalPrice);

        System.out.printf("Tax: $%.2f\n", (totalPrice*tax));

        System.out.printf("The total is $%.2f\n", (totalPrice+(totalPrice*tax)));

    }
}
