/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */



package learning;

import java.util.Scanner;

public class Scratch {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {


		double db = (Math.floor(Double.parseDouble(sc.nextLine()) * 100))/100.f;

		double eb = 100.124;

		System.out.printf("%.2f", eb);
	}

}
