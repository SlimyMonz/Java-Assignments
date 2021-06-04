/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package learning.learn_JUnit;

public class PrintGrades {

	public String print(int grade) {
		if (grade >= 90) {
			return "You got an A!";
		} else if (grade >= 80) {
			return "You received a B.";
		} else if (grade >= 70) {
			return "You received a C.";
		} else {
			return "Study harder. Failure.";
		}
	}

}
