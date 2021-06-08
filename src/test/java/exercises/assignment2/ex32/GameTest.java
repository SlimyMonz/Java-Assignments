/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

	@Test
	void setGenerateNumber() {

		int expected = 500;

		double random = 0.5;
		int difficulty = 3;
		int maximum = (int) Math.pow(10, difficulty);
		int actual = (int) ((random * (maximum-1) + 1));

		assertEquals(expected, actual);

	}

	@Test
	void inputToInt() {

		int expected = -1;

		int output;
		String input = "akfjsldjfk";

		try {
			output = Integer.parseInt(input);
		} catch (NumberFormatException error) {
			output = -1;
		}
		int actual = output;

		assertEquals(actual, expected);
		
	}


}