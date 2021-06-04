/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment1.ex21;

import java.util.Scanner;

public class EX21 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int input = 0;
        String printThis = ("The name of the month is %s.");

        do {

            try {
                System.out.print("Enter the number for the month: ");
                input = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException ex) {

                System.out.println(ex + " is invalid. Enter an integer!");

            }

        } while (input < 1 || input > 12);

        String month = switch (input) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "nonexistent";
        };

        System.out.printf(printThis, month);

    }
}
