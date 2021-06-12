/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex39;

import java.util.*;

public class Employees_EX39 {


	String[] employee1 =  {"John", "Johnson", "Manager", "2016-12-31"};
	String[] employee2 = {"Tou", "Xiong", "Software Engineer", "2016-10-05"};
	String[] employee3 = {"Jake", "Jacobson", "Programmer", ""};
	String[] employee4 = {"Jacquelyn", "Jackson", "DBA", ""};
	String[] employee5 = {"Sally", "Webber", "Web Developer", "2015-12-18"};
	String[] employee6 = {"Michaela", "Michaelson", "District Manager", "2015-12-19"};


	ArrayList<TreeMap<Integer, String>> employeeArray = new ArrayList<>();


	public void setEmployee(String[]...arrays) {

		for (String[] array: arrays) {

			TreeMap<Integer, String> employeeMap = new TreeMap<>();

			for (int i = 0; i < array.length; i++) {

				employeeMap.put(i, array[i]);
			}
			employeeArray.add(employeeMap);
		}
	}

	public Employees_EX39() {
		setEmployee(employee1, employee2, employee3, employee4, employee5, employee6);

		printOrderArray(sortLastNames(employeeArray));

	}

	private ArrayList<String> sortLastNames(ArrayList<TreeMap<Integer, String>> array) {

		ArrayList<String> lastNames = new ArrayList<>();

		array.forEach((TreeMap<Integer, String> TreeMap) -> lastNames.add(TreeMap.get(1)));

		Collections.sort(lastNames);

		return lastNames;

	}

	private void printOrderArray(ArrayList<String> array) {
		ArrayList<TreeMap<Integer, String>> reorderArray = new ArrayList<>();

		array.forEach(string -> {
			for (TreeMap<Integer, String> integerStringTreeMap : employeeArray) {
				if (integerStringTreeMap.get(1).equals(string)) {
					reorderArray.add(integerStringTreeMap);
				}
			}
		});

		String printFormat = ("%-10s | %-10s | %-18s | %-1s\n");

		System.out.printf("%-10s | %-10s | %-18s | %-1s\n", "First Name", "Last Name", "Job", "Date Leaving");
		System.out.print("-----------------------------------------------------------\n");


		for (TreeMap<Integer, String> employeeTreeMap : reorderArray) {

			System.out.printf(printFormat, employeeTreeMap.get(0), employeeTreeMap.get(1), employeeTreeMap.get(2), employeeTreeMap.get(3));

			}

		}

	}




