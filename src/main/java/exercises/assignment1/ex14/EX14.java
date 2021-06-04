/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment1.ex14;

import java.util.Scanner;

public class EX14 {

    public static Scanner sc = new Scanner(System.in);
    public static String taxedState = "WI";

    public static void main(String[] args) {

        System.out.print("What is the order amount? ");
        double amount = sc.nextDouble();

        sc.nextLine(); // required to stop skipping of 'state' String, doesn't do anything else

        System.out.print("What is the state? ");
        String state = sc.nextLine();

        //alright this complex mess basically gets the tax and rounds to the nearest cent
        double tax = (double) (Math.round((amount*100) * ((state.equals(taxedState)) ? 0.055 : 0)))/100;

        if (tax > 0) {
            System.out.printf("The subtotal is: $%.2f.\n", amount);
            System.out.printf("The tax is $%.2f.\n", tax);
        }

        System.out.printf("The total is $%.2f.", amount+tax);

    }
}
