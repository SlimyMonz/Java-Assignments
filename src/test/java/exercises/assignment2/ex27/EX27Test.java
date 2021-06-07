/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EX27Test {

	EX27 ex27 = new EX27();

	@Test
	void validateInput() {

		String expected = "Try again."; //this essentially means the same as "false";
		String actual = ex27.validateInput("Harry", "Potter", "11111", "A7-BBBB");

		assertEquals(expected, actual);
	}

	@Test
	void checkFirstName() {
		boolean actual = ex27.checkFirstName("Ashley1234");
		assertTrue(actual);
	}

	@Test
	void checkLastName() {
		boolean actual = ex27.checkLastName("CannotType130943");
		assertTrue(actual);
	}

	@Test
	void checkZIP() {
		String input = "1gg23436";

		boolean expected = false;
		boolean actual = ex27.checkZIP(input);

		assertEquals(expected, actual);

	}


	@Test
	void checkID() {

		String input = "ab-1234";

		boolean actual = ex27.checkID(input);

		assertTrue(actual);
	}
}