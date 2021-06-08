/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex32;

import java.util.Scanner;

public class EX32 {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String input;

		do {
			new GameEX32();
			do {
				System.out.println(GameEX32.outPuts[6]);
				input = sc.nextLine();
			} while (!(input.equals("Y") || input.equals("N")));

		} while (input.equals("Y"));
		System.out.println("What? Are you scared of a stupid little app? LMAO BYE!");
	}
}
