/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class WinnerEX35 {
	private final Scanner sc = new Scanner(System.in);

	ArrayList<String> winners = new ArrayList<>();
	int randomWinner = -1;

	public WinnerEX35() {

		setWinners();
		setRandomWinner();
		getWinner();
	}

	private void setWinners() {

		String input;

		do {

			System.out.print("Enter a name: ");

			input = sc.nextLine();

			if (!input.equals("")) winners.add(input);

		} while (!input.equals(""));
	}


	private void setRandomWinner() {

		randomWinner = (int) ((Math.random() * winners.size()));
	}


	private void getWinner() {
		System.out.printf("The winner is... %s.", winners.get(randomWinner));
	}


}
