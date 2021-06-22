/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFile_EX46 {

	//this stuff can probably be shortened somehow, but it's the best I can do for now
	private final String systemDir = System.getProperty("user.dir");
	private final Path txtPath = Paths.get(systemDir + "/input/exercise46_input.txt");

	String txtContents;

	//constructor to create the txtContents file, will be used for ParseText_EX46 when called in
	public TextFile_EX46() {
		setTxtContents();
	}

	//to be used by ParseText_EX46 to read String
	public String getTxtContents() {
		return txtContents;
	}

	//probably won't be used outside of this class
	private Path getTxtPath() {
		return txtPath;
	}

	//only used by constructor, takes text from .txt file and puts it into txtContents as a string.
	private void setTxtContents() {

		String string = "";
		try {
			string = Files.readString(getTxtPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		string = string.replace("\n", " ");
		txtContents = string;
	}


}
