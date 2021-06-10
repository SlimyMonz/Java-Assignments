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

	private final ArrayList<String> characters = new ArrayList<>(Arrays.asList(
			"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",
			"0123456789",
			"!@#$%^&*"
	));

	private final String[] outputStrings = {
			"What's the minimum length? ",
			"How many numbers? ",
			"How many special characters? ",
			"Need as many numbers as numbers and special characters. You'll need to enter the values again. \n",
			"Your password is: "
	};

	public PassGen_EX37() {

		int[] inputs = new int[3]; //can't be more than three inputs

		do {

			getValues(inputs);

			if (!(enoughLetters(inputs))) System.out.println(outputStrings[3]);

		} while (!(enoughLetters(inputs)));

		inputs[0] -= (inputs[1]+inputs[2]); //sets the number of letters for use later

		generatePassword(inputs);

	}


	private void getValues(int[] inputArray) {

		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(outputStrings[(i)]);
			inputArray[i] = sc.nextInt();
		}
	}


	protected boolean enoughLetters(int[] inputArray) {
		return (inputArray[0] / (inputArray[1] + inputArray[2]) >= 2);
	}


	private void generatePassword(int[] inputArray) {

		System.out.print(outputStrings[4]);

		ArrayList<String> stringArray;

		for (int i = 0; i < inputArray.length; i++) {

			stringArray = new ArrayList<>( Arrays.asList(characters.get(i).split("")));

			for (int j = 0; j < inputArray[i]; j++) {
				System.out.print(stringArray.get(((int) (Math.random() * (stringArray.size())))));
			}

			stringArray.clear();

		}
	}
}
