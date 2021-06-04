/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment1.ex20;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EX20 {

    public static Scanner sc = new Scanner(System.in);
    public static String[] caseWisconsin = {"WI", "WISCONSIN"};
    public static String[] taxCounty = {"EAU CLAIRE", "DUNN"};
    public static String[] caseIllinois = {"IL", "ILLINOIS"};


    public static void main(String[] args) {

        System.out.print("What is the order amount? ");
        double order = Double.parseDouble(sc.nextLine());

        System.out.print("What state do you live in? ");
        String state = sc.nextLine().toUpperCase(Locale.ROOT);

        System.out.print("What county do you live in? ");
        String county = sc.nextLine().toUpperCase(Locale.ROOT);

        double tax = getTaxes(state, county);

        double addedTax = tax * order;

        double total = (Math.ceil(100 * (addedTax + order)))/100.f;

        String printThis = ("The tax is $%.2f.\nThe total is $%.2f.");

        System.out.printf(printThis, addedTax, total);

    }

    // it's like 8PM and this is a mess
    public static double getTaxes(String state, String county) {

        double tax = 0;

        if (Arrays.asList(caseWisconsin).contains(state)) {

            tax += 0.05;

            if (Arrays.asList(taxCounty).contains(county)) {

                tax += 0.005;

            }

        } else if (Arrays.asList(caseIllinois).contains(state)) {

            tax += 0.08;

        }

        return tax;
    }

}
