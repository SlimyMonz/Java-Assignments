/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EX29Test {
	EX29 ex29 = new EX29();


	@Test
	void checkInput() {

		String input = "12348291.1012352341";

		assertTrue(ex29.checkInput(input));

	}


	@Test
	void calcRate() {
		double expected = (double) 72/10;
		double actual = ex29.calcRate(10);

		assertEquals(expected, actual);
	}

}