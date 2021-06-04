/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex26;

import java.util.Scanner;

public class CreditDebt {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		CreditDebt ex26 = new CreditDebt();

		String monthsToPay = ex26.calculateMonthsUntilPaidOff(ex26.get(1), ex26.get(2), ex26.get(3));

		System.out.printf("It will take you %s months to pay off this card.", monthsToPay);

	}

	String calculateMonthsUntilPaidOff(String currentBalance, String APR, String monthlyPayments) {

		double balance = Math.ceil(100*Double.parseDouble(currentBalance))/100.f;
		double rate = Double.parseDouble(APR)/(36500); //APR is a yearly percent, rate is a daily decimal.
		double pay = Math.ceil(100*Double.parseDouble(monthlyPayments))/100.f;

		double power = Math.pow(1+rate, 30);
		double log1 = Math.log10(1+balance/pay*(1-power));
		double log2 = Math.log10(1+rate);

		if (Double.isNaN(log1) || Double.isNaN(log2)) {
			return "infinite";
		}

		int calculation = (int) Math.ceil(-(1/30.f) * log1 / log2);

		return String.valueOf(calculation);

	}

	String get(int i) {

		switch (i) {
			case 1 -> System.out.print("What is your balance? ");
			case 2 -> System.out.print("What is the APR on the card (as a percent)? ");
			case 3 -> System.out.print("What is the monthly payment you can make? ");
			default -> System.out.println("You code badly and should feel bad.");
		}
		return sc.nextLine();
	}

}
