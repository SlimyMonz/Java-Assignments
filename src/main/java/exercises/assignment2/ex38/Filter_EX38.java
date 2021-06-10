/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex38;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Filter_EX38 {

	private final Scanner sc = new Scanner(System.in);

	private String input;

	private final ArrayList<String> output = new ArrayList<>();


	public Filter_EX38() {

		getInput();
		setOutput(input);
		input = filterEvenNumbers(output);
		setOutput(input);
		printAll();

	}


	private void printAll() {

		String printEven = "The even numbers are ";

		String stringOut =
				printEven + output.toString()
						.replace("[", "")
						.replace(",","")
						.replace("]", ".");

		System.out.println(stringOut);
	}


	private void getInput() {
		System.out.print("Enter a list of numbers, separated by spaces: ");
		input = sc.nextLine();
	}


	private void setOutput(String input) {

		output.clear();
		output.addAll(Arrays.asList((input.split(""))));

	}


	private String filterEvenNumbers(ArrayList<String> array) {

		StringBuilder sorted = new StringBuilder();
		int integer;

		for (String item: array) {

			try {

				integer = Integer.parseInt(item);

				if (integer % 2 == 0) {
					sorted.append(item);
				}

			} catch (NumberFormatException ignore) {}
		}

		return sorted.toString();
	}

}
