/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex01;

import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");

        String firstName = input.nextLine();

        String greeting = "Hello, " + firstName + ", nice to meet you!";

        System.out.println(greeting);

    }
}