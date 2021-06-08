/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex33;

import java.util.Scanner;


public class EX33 {

	private final static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {

		System.out.println("What is your question?");

		String input = sc.nextLine();

		System.out.println(eightBall[generatedNum()]);

	}


	private final static String[] eightBall = {

			"Null.",
			"Yes.",
			"No.",
			"Maybe.",
			"Ask again later.",
			"Uh... ",
			"Seriously?",
			"In your dreams.",
			"Your wish is my command."

	};

	static int generatedNum() {
			return (int) ((Math.random() * (eightBall.length-1) + 1));
	}

}
