/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

/*
Exercise 31 - Karvonen Heart Rate
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
The Karvonen heart rate formula is one method you can use to determine your rate.
Create a program that prompts for your age and your resting heart rate.
Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.
Generate a table with the results as shown in the example output. The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm
Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.
 */

package exercises.assignment2.ex31;

import java.io.InputStream;
import java.util.Scanner;

public class EX31 {

	private static final InputStream in = System.in;
	private static final Scanner sc = new Scanner(in);
	private static final EX31 ex31 = new EX31();

	public static void main(String[] args) {

		ex31.runProgram();

	}


	public void runProgram() {

		String str1 = "Enter your resting heart-rate (BPM): ";
		String str2 = "Enter your age: \n";

		int heartRate = Integer.parseInt(getInput(str1));
		int age = Integer.parseInt(getInput(str2));

		printCalculations(heartRate, age);
	}

	private void printCalculations(int heartRate, int age) {

		System.out.printf("Resting Pulse: %d \t \t Age: %d \n", heartRate, age);

		for (int i = 55; i <= 95 ; i+=5) {

			System.out.printf(formatting(), i, calculatePulse(age, heartRate, i));

		}
	}


	public int calculatePulse(int age, int hr, int intensity) {

		return (int) ((((220-age) - hr) * (intensity/100.f)) + hr);
	}


	private String getInput(String print) {
		String input;
		do {
			System.out.print(print);
			input = sc.nextLine();
			input = checkInput(input);
		} while (input.equals("0"));
		return input;
	}


	public String checkInput(String input) {
		try {
			if (Integer.parseInt(input) <= 0) {
				System.out.println("Enter a positive integer!");
				return "0";
			}
		} catch (NumberFormatException error) {
			System.out.println("Invalid input!");
			return "0";
		}
		return input;
	}


	private String formatting() {
		return "%d%% \t \t | %d bpm\n";
	}

}
