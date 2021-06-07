/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class EX26Test {

	EX26 ex26 = new EX26();

	@Test
	void calculateMonthsUntilPaidOff() {

		String string1 = "5000", string2 = "12", string3 = "100";

		String expected = "70", actual = ex26.calculateMonthsUntilPaidOff(string1, string2, string3);

		assertEquals(expected, actual);

	}

}