/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinnerEX35Test {

	@Test
	void setWinner() {

		int arrayLen = 100;
		int loop = arrayLen*100;

		for (int butt = 0; butt < loop; butt++) {
			int randomWinner = (int) ((Math.random() * arrayLen));
			System.out.println(randomWinner);
		}

	}
}