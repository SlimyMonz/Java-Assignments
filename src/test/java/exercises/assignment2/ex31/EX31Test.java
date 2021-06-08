/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EX31Test {

	EX31 ex31 = new EX31();

	@Test
	void checkInput() {

		String expected = "100";

		String actual = ex31.checkInput(expected);

		assertEquals(expected, actual);

	}

	@Test
	void calculatePulse() {
		int expected = 138;
		int actual = ex31.calculatePulse(22, 65, 55);
		assertEquals(expected, actual);
	}

}