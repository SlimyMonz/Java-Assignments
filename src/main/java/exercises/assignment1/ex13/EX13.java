/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment1.ex13;

import java.util.Scanner;

public class EX13 {

    public static Scanner sc = new Scanner(System.in);
    public static String printThis = ("After %d years at %.2f%% compounded %d times per year, the investment will be worth $%.2f");

    public static void main(String[] args) {

        System.out.print("Enter the principle: ");
        double principle = getInput();
        System.out.print("Enter the % rate of interest: ");
        double rate = getInput();
        System.out.print("Enter the number of years: ");
        int years = (int) getInput();
        System.out.print("How many times is interest compounded annually? ");
        int compound = (int) getInput();

        double totalInvest = (principle * Math.pow((1 + ((rate/100)/compound)), (compound*years)));

        System.out.printf(printThis, years, rate, compound, totalInvest);

    }

    public static double getInput() {
        return sc.nextDouble();
    }
}