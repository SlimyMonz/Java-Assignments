/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

/*
Exercise 29 - Handling Bad Input
The rule of 72 is a quick method for estimating how long it will take to double your investment,
by taking the number 72 and dividing it by the expected rate of return.
It’s a good tool that helps you figure out if the stock, bond, or savings account is right for you.
It’s also a good program to write to test for and prevent bad input because computers can’t divide by zero.
And instead of exiting the program when the user enters invalid input,
you can just keep prompting for inputs until you get one that’s valid.

Write a quick calculator that prompts for the rate of return on an investment
and calculates how many years it will take to double your investment.

The formula is:

years = 72 / r
where r is the stated rate of return.

Example Output

What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4

It will take 18 years to double your initial investment.
Constraints
Don’t allow the user to enter 0.
Don’t allow non-numeric values.
Use a loop to trap bad input, so you can ensure that the user enters valid values.
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
