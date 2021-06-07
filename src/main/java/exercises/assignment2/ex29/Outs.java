/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex29;

public class Outs {

	static String[] error = {
			"", // avoids i = 0 instances in for-loops
			"Invalid input.",
			"Must input a number greater than 0.",
			"Stupid idiot!"
	};

	static String askInput =
			"What is the rate of return? ";


	public static void printError(int i) {
		System.out.println(error[i]);
	}


	public static void askInput() {
		System.out.print(askInput);
	}

}
