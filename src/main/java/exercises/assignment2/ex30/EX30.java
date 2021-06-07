/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

/*
Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).

Constraint
Use a nested loop to complete this program.
Align each column within the table without using the tab character.

 */

package exercises.assignment2.ex30;

public class EX30 {
// this program is so simple it doesn't require functions or anything. NO TESTS!
	public static void main(String[] args) {

		int a = 1, b = 12; // change these to change the table

		for (int i = a; i <= b; i++ ) {

			for (int j = 1; j <=b ; j++) {

				System.out.printf("%5d", (i*j));
			}
			System.out.println();
		}
	}
}
