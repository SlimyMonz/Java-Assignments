/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex46;

import java.util.Collections;
import java.util.TreeMap;

public class Words_EX46 {

	ParseText_EX46 ptex46 = new ParseText_EX46();

	String[] words;
	int[] wordCount;
	TreeMap<Integer, String> wordsMap = new TreeMap<>(); // 5, 4, 3... etc

	public TreeMap<Integer, String> getMap() {
		return wordsMap;
	}

	// constructor that takes parameters from ParseText and puts them into words and wordCount;
	public Words_EX46() {
		words = ptex46.getSingleWords(ptex46.getParseText()); //it was added! yay!
		wordCount = ptex46.getEachDuplicate(words); // also added! woo!
		setMap();
	}

	// use String[] and Int[] from class and set the TreeMap in reverse order
	private void setMap() {
		TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		for (int i = 0; i < words.length; i++) {
			map.put(wordCount[i], words[i]);
		}
		this.wordsMap = map;
	}

}
