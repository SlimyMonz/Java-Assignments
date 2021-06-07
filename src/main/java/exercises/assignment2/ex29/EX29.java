/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex29;

import java.util.Scanner;


public class EX29 {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		EX29 ex29 = new EX29();

		double rate = ex29.calcRate(Double.parseDouble(ex29.getInput()));

		System.out.printf("It will take %.2f years to double your investment.", rate);

	}

// test pass
	double calcRate(double r) {
		return (72/r);
	}

// test pass
	boolean checkInput(String input) {
		boolean bool = true;
		try {
			double test = Double.parseDouble(input);
			if (test <= 0) {
				Outs.printError(2);
				bool = false;
			}
		} catch (NumberFormatException error) {
			Outs.printError(1);
			bool = false;
		}
		return bool;
	}

// no test because it's a simple input statement
	String getInput() {

		String userInput;

		do {

			Outs.askInput();
			userInput = sc.nextLine();

		} while(!(checkInput(userInput)));

		return userInput;

	}

}
