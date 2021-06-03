/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex09;

import java.util.Scanner;

public class EX09 {

    public static int gallonCoverage = 350; // 1 gallon covers 350 sqft.

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        int area = (int) Math.ceil(width * length); //rounds UP to nearest integer
        int gallons = (int) Math.ceil((double) area/gallonCoverage); //does the calculation in double, rounds UP to int
        System.out.printf("The calculated area up to the nearest integer is %d square feet.\n", area);
        System.out.printf("You will need at least %d gallons.\n", gallons);

    }
}
