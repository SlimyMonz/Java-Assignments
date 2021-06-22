/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex46;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ParseText_EX46 {

	TextFile_EX46 tfex46 = new TextFile_EX46(); // new instance called in! woo!

	private String[] parseText;

	//make constructor that uses methods to divide the words into the class array
	public ParseText_EX46() {
		String[] temp = getAndSplit();
		this.parseText = new String[temp.length];
		this.parseText = temp;
	}

	//this gets the text String, and returns an array of split words
	private String[] getAndSplit() {
		String txt = tfex46.getTxtContents();
		return txt.split(" ");
	}

	public String[] getParseText() {
		return parseText;
	}

	//make a method that takes a String array and removes duplicates and outputs String array (to Words_EX46.words)
	public String[] getSingleWords(String[] array) {
		LinkedHashSet<String> temp = new LinkedHashSet<>(Arrays.asList(array));
		return temp.toArray(new String[]{}); // MAKE SURE TO CALL THIS FUNCTION INTO WORDS
	}

	// make method that
	// takes a String (from Words_EX46 wordsArray loop)
	// and counts the frequency of a word compared to parseText (from this class)
	// and returns integer
	private int countDuplicates(String string) {
		int integer = 0;
		for (String word : parseText) {
			if(word.equals(string)) integer++;
		}
		return integer;
	}

	// method that loops the above method by taking in a String array (from Words_EX46.words)
	// returns Int[] (to words_EX46.wordCount)
	public int[] getEachDuplicate(String[] stringArray) {
		int[] temp = new int[stringArray.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = countDuplicates(stringArray[i]);
		}
		return temp;
	}


}
