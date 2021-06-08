/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex34;

import java.util.Scanner;

public class EX34 {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		EmployeesEX34 e34 = new EmployeesEX34();

		System.out.println("Here is the employee list:");

		e34.getEmployeeList();

		System.out.print("\nEnter employee name to remove: ");

		e34.subtractEmployee(sc.nextLine());

	}
}
