/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex11;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class EX11 {

	public static Scanner sc = new Scanner(System.in);
	public static MathContext mc = new MathContext(0);
	public static String printThis = ("£%s at an exchange rate of $%s per £1 is $%s");

	public static void main(String[] args) {

		System.out.print("How many Euros are you exchanging? ");
		BigDecimal amount_from = getInput();

		System.out.print("What is the exchange rate of a Euro to USD? ");
		BigDecimal rate_from = getInput();

		BigDecimal amount_to = amount_from.multiply(rate_from, mc);

		amount_from = roundUp(amount_from);
		rate_from = roundUp(rate_from);
		amount_to = roundUp(amount_to);

		System.out.printf(printThis, amount_from, rate_from, amount_to);

	}

	public static BigDecimal getInput() {
		return BigDecimal.valueOf(Double.parseDouble(sc.nextLine()));
	}

	public static BigDecimal roundUp(BigDecimal a) {
	    return a.setScale(2, RoundingMode.UP);
    }


}
