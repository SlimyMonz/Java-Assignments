/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package lecture.week3;

import java.util.Scanner;

public class App {

	static Scanner sc = new Scanner(System.in);
	// static is a Class variable.
	// Without static, it's an instance variable. Don't do this for Scanner.


	public static void main(String[] args) {

	App myApp = new App(); // this allows functions to run in here

		String name = myApp.readName();

		myApp.printOutput(name);

	}


	public void printOutput(String outputString) {
		System.out.println(outputString);
	}

	public String readName() {
		System.out.println("What is your name? ");
		return sc.nextLine();
	}


}
