/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */


package exercises.assignment2.ex25;

import java.util.Scanner;

public class EX25 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		EX25 ex25 = new EX25();

		System.out.print("Enter a password: ");

		String getPass = sc.nextLine();

		int getStr = ex25.passwordValidator(getPass);

		String printThis = "Your password" + " '" + getPass + "' " + passStrength(getStr);

		System.out.println(printThis);

	}

	// tested: pass!
	int passwordValidator(String input) {

		int strLen = input.length();
		int strength = strLen/8;
		String specialChar = "!@#$%^&*";

		if (input.matches(".*\\d.*")) strength++;

		for (int i = 0; i < strLen; i++) {
			if (specialChar.contains(Character.toString((input.charAt(i))))) {
				strength++;
			}
		}

		return strength;
	}

	// tested: PASSED
	static String passStrength(int strength) {

		String[] strengthArray =
				{
						"is too weak.",
						"is weak.",
						"is okay.",
						"is strong.",
						"needs a quantum computer to break it!"
				};

		return switch (strength) {
			case 0 -> strengthArray[0];
			case 1 -> strengthArray[1];
			case 2 -> strengthArray[2];
			case 3 -> strengthArray[3];
			default -> strengthArray[4];
		};

	}

}
