/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX28 {

	static Scanner sc = new Scanner(System.in);

	static final int COUNT = 5;


	public static void main(String[] args) {

		EX28 ex28 = new EX28();

		double totalInput = ex28.addNumbers();

		System.out.println("The total is: " + totalInput);
		
	}


	double addNumbers() {
		double total = 0;
		for (int i = 0; i < COUNT; i++) {
			System.out.printf("%d) Enter a number: ", (i+1));
			try {
				total += Double.parseDouble(sc.nextLine());
			} catch (InputMismatchException error) {
				System.out.print("Not a valid input.\n");
			}
		}

		return total;
	}



}
