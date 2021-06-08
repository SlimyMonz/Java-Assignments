/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex35;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeesEX35 {

	private ArrayList<String> employeeList = new ArrayList<>(Arrays.asList(
			"John Man",
			"Dumb Ho",
			"Hehe",
			"Boss fired me so I threw this in here!"
		)
	);

	private boolean checkEmployee(String input) {

		for (String employee : employeeList) {
			if (input.equals(employee)) return true;
		}
		return false;
	}

	public void getEmployeeList() {
		for (String item : employeeList) {
			System.out.println(item);
		}
	}

	public int getListSize() {
		return employeeList.size();
	}

	public void addEmployee(String input) {

		employeeList.add(input);

	}

	public void subtractEmployee(String input) {

		if (checkEmployee(input)) {
			employeeList.remove(input);
		}else {
			System.out.println("\nThat employee does not exist.\n");
		}
		System.out.printf("There are %d employees: \n", getListSize());
		getEmployeeList();
	}
}
