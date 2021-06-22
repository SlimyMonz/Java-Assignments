/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex46;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EX46Test {

	@Test
	void testsetTxtContents() {

		String string = "";
		try {
			string = Files.readString(Path.of("/Users/monz/IdeaProjects/cop3330-assignment3/src/test/java/assignment3/ex46/testText46.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		string = string.replace("\n", " ");

		assertEquals("BAH BAH AHHHHH AH", string);
	}

	@Test
	public void testgetAndSplit() {
		String txt = "BAH BAH UHHHHH BAH";
		System.out.println(Arrays.toString(txt.split(" ")));
	}

	@Test
	public void testgetSingleWords() {
		String[] expected = {"Yes"};
		String[] array = {"Yes", "Yes", "Yes"};
		LinkedHashSet<String> temp = new LinkedHashSet<>(Arrays.asList(array));
		String[] actual = temp.toArray(new String[]{}); // MAKE SURE TO CALL THIS FUNCTION INTO WORDS
		assertArrayEquals(expected, actual);
	}


}