/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex27;


import java.util.Scanner;

public class EX27 {

	static Scanner sc = new Scanner(System.in);

	static String inputFirst;
	static String inputLast;
	static String inputZIP;
	static String inputID;

	public static void main(String[] args) {

		EX27 ex27 = new EX27();

		ex27.getInput();

		System.out.println(ex27.validateInput(inputFirst, inputLast, inputZIP, inputID));

	}
// not tested due to simple inputs;
	void getInput() {

		System.out.print("What is your first name? ");
		inputFirst = sc.nextLine();
		System.out.print("What is your last name? ");
		inputLast = sc.nextLine();
		System.out.print("What is your ZIP code? ");
		inputZIP = sc.nextLine();
		System.out.print("What is your ID? ");
		inputID = sc.nextLine();

	}

// test passed
	String validateInput(String first, String last, String ZIP, String ID) {

		boolean bool1, bool2, bool3, bool4;

		bool1 = checkFirstName(first);
		bool2 = checkLastName(last);
		bool3 = checkZIP(ZIP);
		bool4 = checkID(ID);

		if (bool1 && bool2 && bool3 && bool4) return "There were no errors found.";

		return "Try again.";
	}

// test passed. Note: requirements never specified non-numerals in the input. Most anything input is acceptable.
	boolean checkFirstName (String input) {

		if (input.length() == 0) {
			System.out.println("The first name must be filled in.\n");
			return false;
		} else if (input.length() <= 2) {
			System.out.printf("\"%s\" is too short.\n", input);
			return false;
		} else {
			return true;
		}
	}

//test passed and same note as checkFirstName
	boolean checkLastName (String input) {

		if (input.length() == 0) {
			System.out.print("The last name must be filled in.\n");
			return false;
		} else if (input.length() <= 2) {
			System.out.printf("\"%s\" is too short.\n", input);
			return false;
		} else {
			return true;
		}
	}

// passed
	boolean checkZIP (String input) {

		try {
			Integer.parseInt(input);
			if (input.length() != 5) {
				System.out.print("The ZIP code must be five numbers.\n");
				return false;
			}
		} catch (NumberFormatException error) {
			System.out.print("The ZIP code must only be numeric.\n");
			return false;
		}

		return true;
	}

// passed
	boolean checkID (String input) {

		char[] array = input.toCharArray();
		String invalid = "\"%s\" is not a valid ID.\n";
		String numbers;

		// turns every value after '-' into a String and checks that array is long enough
		try {
			numbers = new String(array, 3, (array.length-3));
		} catch (StringIndexOutOfBoundsException error) {
			System.out.printf(invalid, input);
			return false;
		}

		//checks that the numbers are actually numbers
		try {
			Integer parseInt = Integer.parseInt(numbers);
		} catch (NumberFormatException error) {
			System.out.printf(invalid, input);
			return false;
		}

		// checks "**-####" if "**" are both letters
		if (!(Character.isLetter(array[0]) && Character.isLetter(array[1]))) {
			System.out.printf(invalid, input);
			return false;
		}

		// third item in the array MUST be '-'
		if (array[2] != '-') {
			System.out.printf(invalid, input);
			return false;
		}

		return true;
	}
}
