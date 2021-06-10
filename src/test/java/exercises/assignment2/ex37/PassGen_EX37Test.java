/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PassGen_EX37Test {

	PassGen_EX37 pg37 = new PassGen_EX37();

	int[] array = {6, 1, 2};

	@Test
	void enoughLetters() {

		assertTrue(pg37.enoughLetters(array));
	}


}