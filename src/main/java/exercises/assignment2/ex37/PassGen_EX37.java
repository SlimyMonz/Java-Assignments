/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PassGen_EX37 {

	private final Scanner sc = new Scanner(System.in);

	private final ArrayList<String> characters = new ArrayList<>();
	// Empty?? Check the bottom method!

	private final String[] outputStrings = {
			"What's the minimum length? ",
			"How many numbers? ",
			"How many special characters? ",
			"Need as many numbers as numbers and special characters. You'll need to enter the values again. \n",
			"Your password is: "
	};

	public PassGen_EX37() {

		int[] inputs = new int[3];
		do {

			getValues(inputs);
			if (!(enoughLetters(inputs))) System.out.println(outputStrings[3]);

		} while (!(enoughLetters(inputs)));

		generatePassword(inputs);

	}

	private void addCharacters(String... list) {

		for (String character : list) {

			characters.addAll(Arrays.asList((character.split(""))));

		}
	}

	private void getValues(int[] inputArray) {

		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(outputStrings[(i)]);
			inputArray[i] = sc.nextInt();
		}
	}


	private boolean enoughLetters(int[] inputArray) {
		return (inputArray[0] / (inputArray[1] + inputArray[2]) >= 2);
	}

	private void generatePassword(int[] inputArray) {

		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialChar = "!@#$%^&*";

		addCharacters(upperCase, lowerCase, numbers, specialChar);

		System.out.print(outputStrings[4]);

		for (int i = 0; i < (inputArray[0] - inputArray[1] - inputArray[2]); i++) {
			System.out.print(characters.get(((int) (Math.random() * (upperCase.length() + lowerCase.length())))));
		}

		for (int i = 0; i < inputArray[1]; i++) {
			System.out.print(characters.get(((int) (Math.random() * numbers.length()) + (upperCase.length() + lowerCase.length()))));
		}

		for (int i = 0; i < inputArray[2]; i++) {
			System.out.print(characters.get(((int) (Math.random() * (specialChar.length())) + (characters.size() - specialChar.length()))));
		}
	}
}
