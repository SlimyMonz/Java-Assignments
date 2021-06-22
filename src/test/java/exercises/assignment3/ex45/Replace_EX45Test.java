/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex45;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Replace_EX45Test {

	@Test
	public void replaceString() {
		String string = "utilizezezez";
		assertEquals("usezezez", string.replace("utilize", "use"));
	}

	@Test
	public void createString() {
		String tempString = "";
		try {
			tempString = Files.readString(Path.of("/Users/monz/IdeaProjects/cop3330-assignment3/src/test/java/assignment3/ex45/input.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertEquals("LAME", tempString);
	}

	@Test
	public void saveFile() {
		Path saveFileTo = Path.of("/Users/monz/IdeaProjects/cop3330-assignment3/src/test/java/assignment3/ex45/output.txt");

		// creates the file with the new filename
		try {
			Files.createFile(saveFileTo);
		} catch (IOException ignored) {}

		String newString = "Lamer";
		// writes the contents of the new string to the new file
		try {
			Files.writeString(saveFileTo, newString);
		} catch (IOException ignored) {}
		assertEquals("Lamer", newString);
	}

}