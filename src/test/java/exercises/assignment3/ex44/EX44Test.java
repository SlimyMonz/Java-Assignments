/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment3.ex44;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;


class EX44Test {

	String path = "/Users/monz/IdeaProjects/cop3330-assignment3/src/test/java/assignment3/ex44/test44.json";
	Gson gson = new Gson();


	@Test
	public void makeGsonJavaObject() {

		Object object = null;

		try {
			object = gson.fromJson(new FileReader(path), Object.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(object);


	}

	@Test
	void testingGson() {

		try {
			// create Gson instance
			Gson gson = new Gson();

			// create a reader
			Reader reader = Files.newBufferedReader(Paths.get(path));

			// convert JSON file to map
			Map<Object, ArrayList<Map<String, String>>> jsonObj = gson.fromJson(reader, Map.class);

			reader.close();

			System.out.println(jsonObj);

			System.out.println();

			ArrayList<Map<String, String>> mapArray = jsonObj.get("products");

			System.out.println(mapArray);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}


}