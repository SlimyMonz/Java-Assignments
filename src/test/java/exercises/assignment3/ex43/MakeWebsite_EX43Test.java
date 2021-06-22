/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex43;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MakeWebsite_EX43Test {

	private final Scanner sc = new Scanner(System.in);
	private final String outputPathString =
			"/Users/monz/IdeaProjects/cop3330-assignment3/src/main/java/assignment3/ex43/website/";
	private List<String> inputs = new ArrayList<>();

	private final String[] questions = {
			"Site name: ",
			"Author: ",
			"Do you want a JavaScript folder? ",
			"Do you want a CSS folder? "
	};

	@Test
	public void getInputs() {
		// this goes through the String array and asks each question and puts it into the ArrayList
		// Note: no constraints for proper input lmao
		for (String question : questions) {
			System.out.print(question);
			System.out.print("YES\n");
			inputs.add("YES");
		}
		System.out.println(inputs);
	}

	@Test
	public void generateFolder()  {

		String folderName = "website";

		Path folder = Paths.get(outputPathString + folderName);

		try {
			Files.createDirectory(folder);
		} catch (IOException ignored) {

		}

	}

	@Test
	public void generateIndex() throws IOException{

		Path indexfile = Paths.get(outputPathString + "index.html");
		Files.createFile(indexfile);

		FileWriter fWriter;
		BufferedWriter writer;
		try {
			fWriter = new FileWriter(indexfile.toString());
			writer = new BufferedWriter(fWriter);
			writer.write("<title>" + "websiteName" + "</title>");
			writer.newLine(); //this is not actually needed for html files - can make your code more readable though
			writer.close(); //make sure you close the writer object
		} catch (Exception e) {
			//catch any exceptions here
		}

	}

}