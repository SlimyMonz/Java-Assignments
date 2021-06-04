/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
Constraints
Create a passwordValidator function that takes in the password as its argument and returns
a value you can evaluate to determine the password strength.
Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
 */

package exercises.assignment2.ex25;

import java.util.Scanner;

public class Password {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Password ex25 = new Password();

		System.out.print("Enter a password: ");

		String getPass = sc.nextLine();

		int getStr = ex25.passwordValidator(getPass);

		String printThis = "Your password" + " '" + getPass + "' " + passStrength(getStr);

		System.out.println(printThis);

	}


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
