/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex22;

import java.util.Scanner;

public class EX22 {

	private final int INPUTS = 3; //modify this to change how many inputs are needed in the array

	private final Scanner sc = new Scanner(System.in);
	private final double[] inputs = new double[INPUTS];


	public static void main(String[] args) {

		EX22 app = new EX22();

		app.getNumber(app.inputs);

		int maxValue = (int) Math.round(app.findMax(app.inputs));

		System.out.println("The max value is " + maxValue + ".");

	}

	private void getNumber(double[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.printf("Enter the %s number: ", placeString(i));
			try {
				array[i] = Double.parseDouble(sc.nextLine());
			} catch (NumberFormatException e) {
				array[i] = 0;
			}
		}
	}

	private boolean checkSame(double[] array) {

		for (int i = 0; i < (array.length - 1); i++) {
			if (array[i] != array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	private double findMax(double[] array) {

		if (checkSame(array)) {
			System.out.println("All inputs are interpreted as the same.");
			System.exit(0);
		}


		double max = Double.NEGATIVE_INFINITY;

		for (double value : array) {
			if (max < value) max = value;
		}
		return max;
	}

	private String placeString(int i) {
		return switch (++i) {
			case 1 -> "first";
			case 2 -> "second";
			case 3 -> "third";
			case 4 -> "fourth";
			case 5 -> "fifth";
			case 6 -> "sixth";
			case 7 -> "seventh";
			case 8 -> "eighth";
			case 9 -> "ninth";
			default -> Integer.toString(i);
		};
	}

}
