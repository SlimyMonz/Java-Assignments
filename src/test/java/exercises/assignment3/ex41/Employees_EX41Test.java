/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Employees_EX41Test {

	Employees_EX41 ex41 = new Employees_EX41();

	List<String> array = new ArrayList<>();

	@Test
	void readText() {
		try {
			List<String> lines = Files.readAllLines(ex41.filePath, ex41.charset);
			array.addAll(lines);
		} catch (IOException ignored) {}
		System.out.println(array);
	}

	@Test
	public void organizeEmployees() {
		array.clear();
		array.add("Z");
		array.add("A");
		array.sort(Comparator.comparing(String::toString));
		System.out.println(array);
	}


}