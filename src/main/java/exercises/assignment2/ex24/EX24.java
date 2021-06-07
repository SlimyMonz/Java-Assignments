/*
 * UCF COP3330 Summer 2021 Assignment 2
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex24;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EX24 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		EX24 ex24 = new EX24();

		ex24.runProgram();

	}

	// this program is not tested because it is a compilation of other tested methods
	void runProgram() {

		System.out.println("Enter two words to see if they're anagrams: ");

		System.out.print("Enter the first word: ");
		String input1 = getInput();

		System.out.print("Enter the second word ");
		String input2 = getInput();

		if(isAnagram(input1,input2)) {
			System.out.println("They are anagrams!");
		} else {
			System.out.println("They are not anagrams.");
		}

	}


	String getInput() {
		return sc.nextLine().toUpperCase(Locale.ROOT);
	}

// tested: PASSED
	boolean isAnagram(String s1, String s2) {

		char[] c1 = organizeArray(s1);
		char[] c2 = organizeArray(s2);

		return Arrays.equals(c1, c2);

	}

// tested: PASSED
	char[] organizeArray(String input) {

		char[] array = input.toCharArray();

		Arrays.sort(array);

		return array;
	}

}
