/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex46;

import java.util.Map;

public class EX46 {
	public static void main(String[] args) {
		Words_EX46 wex46 = new Words_EX46();

		Map<Integer,String> mapOfWords = wex46.getMap();

		for (Map.Entry<Integer, String> entry : mapOfWords.entrySet()) {
			System.out.printf("%-10s: ", entry.getValue());
			for (int i = 0; i < entry.getKey(); i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
