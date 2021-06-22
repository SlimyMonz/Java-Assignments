/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex42;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;


class Employees_EX42Test {

	public String inputPathString =
			"/Users/monz/IdeaProjects/cop3330-assignment3/src/main/java/assignment3/ex42/exercise42_input.txt";
	public Path filePath = Paths.get(inputPathString);
	public Charset charset = StandardCharsets.UTF_8;

	@Test
	public void setEmployeeList() {

		List<String> array = new ArrayList<>();

		try {
			List<String> lines = Files.readAllLines(filePath, charset);
			array.addAll(lines);
		} catch (IOException ignored) {}
		System.out.println(array);

		assertFalse(array.isEmpty());

	}


	@Test
	public void printMap() {

		String format = "%-10s  %-10s  %-10s\n";
		System.out.printf(format, "Last", "First", "Salary");
		System.out.println("------------------------------");

		for (int i = 0; i <= 100000000; i+=1000000) {
			System.out.printf(format, i, i, i);
		}

	}

}