/*
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Harry Hocker
 */

package exercises.ex04;

import java.util.Scanner;

public class Madlib {

	Scanner sc = new Scanner(System.in);

	private String noun, verb, adjective, adverb;

	public Madlib() {
		setNoun();
		setVerb();
		setAdjective();
		setAdverb();

		String template = String.format("%s is %s %s with %s friends.", noun, adverb, verb, adjective );

		System.out.println(template);
	}

	private void setNoun() {
		System.out.print("Enter a noun: ");
		noun = sc.nextLine();
	}

	private void setAdjective() {
		System.out.print("Enter an adjective: ");
		adjective = sc.nextLine();
	}

	private void setVerb() {
		System.out.print("Enter a verb: ");
		verb = sc.nextLine();
	}

	private void setAdverb() {
		System.out.print("Enter an adverb: ");
		adverb = sc.nextLine();
	}



}
