/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex35;

import java.util.Scanner;

public class EX35 {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		EmployeesEX35 e35 = new EmployeesEX35();

		System.out.println("Here is the employee list:");

		e35.getEmployeeList();

		System.out.print("\nEnter employee name to remove: ");

		e35.subtractEmployee(sc.nextLine());

	}
}
