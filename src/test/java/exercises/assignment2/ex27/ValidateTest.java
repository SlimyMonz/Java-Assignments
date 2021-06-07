/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {

	Validate ex27 = new Validate();

	@Test
	void checkFirstName() {
	}

	@Test
	void checkLastName() {
	}

	@Test
	void checkZIPTest() {
		String input = "1gg23436";

		boolean expected = false;
		boolean actual = ex27.checkZIP(input);

		assertEquals(expected, actual);

	}


	@Test
	void checkIDTest() {

		String input = "ab-1234";

		boolean actual = ex27.checkID(input);

		assertTrue(actual);
	}
}