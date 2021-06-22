/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

/*
put input file in same directory as program
load it into a string
use a string parse method to find all usages of the word
use another method to replace all instances of the word
print out the new string
ask the user for an output filename
output the file by creating a new text file and writing the new string
 */

package exercises.assignment3.ex45;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Replace_EX45 {

	private final String systemDir = System.getProperty("user.dir");
	private final Path inputPath = Paths.get(systemDir + "/input/exercise45_input.txt");

	//this takes the path above and reads it into a String, then returns the value
	private String createString() {
		String tempString = "";
		try {
			tempString = Files.readString(inputPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tempString;
	}

	//this takes a String value and replaces it each instance of one word with another (hard-coded for now)
	private String replaceString(String string) {
		return string.replace("utilize", "use");
	}

	//this method takes in the user input file name and creates the file, then writes the new string to the file
	private void saveFile(String fileName, String newString) {
		Path saveFileTo = Paths.get(systemDir + "/output/" + fileName + ".txt");

		// creates the file with the new filename
		try {
			Files.createFile(saveFileTo);
		} catch (IOException ignored) {}

		// writes the contents of the new string to the new file
		try {
			Files.writeString(saveFileTo, newString);
		} catch (IOException ignored) {}
	}

	// executes the class code in proper order
	public Replace_EX45() {
		Scanner sc = new Scanner(System.in);

		String oldStr = createString();
		String newStr = replaceString(oldStr);

		System.out.println(newStr);
		System.out.print("\nWhat would you like to name the file? ");

		saveFile(sc.nextLine(), newStr);
	}

}