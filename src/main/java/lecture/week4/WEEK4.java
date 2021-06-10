/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package lecture.week4;

public class WEEK4 {

	static WEEK4 w4 = new WEEK4();
	static W4_Calc w4c = new W4_Calc();

	public static void main(String[] args) {

	// user starts up app
		// types in expression
		// asks for answer
		// display answer to user
	// user ends app

		double arg1 = w4.readArgument();
		double arg2 = w4.readArgument();
		String op = w4.readOperator();

		double calcAns = w4c.calcAdd(arg1, arg2);

	}


	private String readOperator() {
		return "";
	}

	public double readArgument() {
		return 0;
	}

	public double displayAnswer(double calcAns) {
		return 0;
	}

}
