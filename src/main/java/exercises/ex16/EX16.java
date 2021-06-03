/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex16;

import java.util.Scanner;

public class EX16 {

    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("What is your age? ");

        int ageInput = Integer.parseInt(sc.nextLine());

        System.out.printf("You are %s old enough to legally drive.", (ageInput >= 16) ? "\b" : "not");

    }
}
