/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

/*
Exercise 28 - Adding Numbers
In previous programs, you asked the user for repeated input by writing the input statements multiple times.
But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.


Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.
 */

package exercises.assignment2.ex28;

import java.util.Scanner;

public class EX28 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		String[] inputs = new String[5];

		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = sc.nextLine();
		}
		
	}

}
