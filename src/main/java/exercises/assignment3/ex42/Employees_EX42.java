/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex42;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Employees_EX42 {

	private static final String[] inputValues = {"LastName", "FirstName", "Salary"};

	String systemDir = System.getProperty("user.dir");
	private final String inputPathString = systemDir + "/input/exercise42_input.txt";

	public Path filePath = Paths.get(inputPathString);
	public Charset charset = StandardCharsets.UTF_8;
	public List<String> employeeList = new ArrayList<>();
	public List<HashMap<String, String>> employeeMap = new ArrayList<>();


	public Employees_EX42() {

		setEmployeeList(employeeList);
		setEmployeeMap(employeeList, employeeMap);
		printMap(employeeMap);

	}

	public void setEmployeeList(List<String> array) {

		try {
			List<String> lines = Files.readAllLines(filePath, charset);
			array.addAll(lines);
		} catch (IOException ignored) {
		}
	}

	public void setEmployeeMap(List<String> array, List<HashMap<String, String>> map) {
		List<String> tempArray;
		for (String string : array) {
			HashMap<String, String> tempMap = new HashMap<>();
			tempArray = Arrays.asList(string.split(",")); // create a method that takes a string and splits it by ","
			arrayToMap(tempArray, tempMap); // put array into maps
			map.add(tempMap); //add Map to ArrayList
		}
	}

	private void arrayToMap(List<String> tempArray, HashMap<String, String> tempMap) {
		for (int i = 0; i < tempArray.size(); i++) {
			tempMap.put(inputValues[i], tempArray.get(i));
		}
	}

	public void printMap(List<HashMap<String, String>> mapArray) {

		String format = "%-10s  %-10s  %-10s\n";
		System.out.printf(format, "Last", "First", "Salary");
		System.out.println("------------------------------");

		for (HashMap<String, String> hashMap : mapArray) {
			System.out.printf(format, hashMap.get(inputValues[0]), hashMap.get(inputValues[1]), hashMap.get(inputValues[2]));
		}

	}

}
