/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EX25Test {

	EX25 ex25 = new EX25();

	@Test
	void passwordValidatorTest() {
		String test = "123abcd&";
		int expected = 3;
		int actual = ex25.passwordValidator(test);
		assertEquals(expected, actual);
	}

	@Test
	void testPasswordStrength() {
		int input = 2;
		String expected = "is okay.";
		String actual = EX25.passStrength(input);
		assertEquals(expected, actual);
	}
}