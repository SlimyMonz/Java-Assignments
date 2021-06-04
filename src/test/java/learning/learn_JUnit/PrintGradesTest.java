/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package learning.learn_JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintGradesTest {

	@Test
	public void test() {

		PrintGrades pg = new PrintGrades();

		String result = pg.print(90);

		assertEquals("You got an A!", result);

	}

}