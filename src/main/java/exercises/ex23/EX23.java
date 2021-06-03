/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex23;

import java.util.Locale;
import java.util.Scanner;

public class EX23 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		EX23 app = new EX23();

        app.troubleshootCar();

	}

	private Boolean getInput() {

		Boolean bool;
		String input;

		do {
			input = sc.nextLine().toUpperCase(Locale.ROOT);
			if (input.equals("Y") || input.equals("YES")) {
				bool = Boolean.TRUE;
			} else if (input.equals("N") || input.equals("NO")) {
				bool = Boolean.FALSE;
			} else {
				System.out.println("Enter a valid response (Y/N): ");
				bool = null;
			}
		} while (bool == null);

		return bool;
	}

	private void troubleshootCar() {

        System.out.print("Is the car silent when you turn the key? ");
        if (getInput()) {
            System.out.print("Are the battery terminals corroded? ");
            if (getInput()) {
                System.out.println("Clean the terminals and try starting again.");
            } else {
                System.out.println("Replace battery cables and try again.");
            }
        } else {
            System.out.print("Does the car make a slicking noise? ");
            if (getInput()) {
                System.out.println("Replace the battery.");
            } else {
                System.out.print("Does the car crank up, but fail to start? ");
                if (getInput()) {
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.print("Does the engine start and then die? ");
                    if (getInput()) {
                        System.out.print("Does your car have fuel injection? ");
                        if (getInput()) {
                            System.out.println("Get it in for service.");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
