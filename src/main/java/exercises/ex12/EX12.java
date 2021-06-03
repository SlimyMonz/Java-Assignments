/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex12;

import java.util.Scanner;

public class EX12 {

    public static Scanner sc = new Scanner(System.in);
    public static String printThis = ("After %d years at %.2f%%, the investment will be worth $%d");

    public static void main(String[] args) {

        System.out.print("Enter the principle: ");
        double principle = getInput();
        System.out.print("Enter the % rate of interest: ");
        double rate = getInput();
        System.out.print("Enter the number of years: ");
        int years = (int) getInput();

        int totalInvest = (int) Math.ceil(principle*(1 + (rate/100) * years));

        System.out.printf(printThis, years, rate, totalInvest);

    }

    public static double getInput() {
        return sc.nextDouble();
    }
}
