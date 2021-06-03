/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex06;

import java.time.Year;
import java.util.Scanner;

public class EX06 {

    public static void main(String[] args) {

        int year = Year.now().getValue();

        System.out.print("What is your current age? ");

        int age = getNumber();

        System.out.print("When would you like to retire? ");

        int oldAge = getNumber();

        System.out.println("You have " + (oldAge-age) + " years until you retire!");

        System.out.printf("The current year is %s. You will retire in %s.", year, (year+oldAge-age));

    }

    public static int getNumber() {
        String str;
        boolean define;
        Scanner sc = new Scanner(System.in);
        do {
            str = sc.nextLine();
            define = stringCheck(str);
        } while (!define);

        return Integer.parseInt(str);
    }

    public static boolean stringCheck(String str) {
        //checks that input is a proper number
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.print("Enter a valid number: ");
            return false;
        }
        return true;
    }

}
