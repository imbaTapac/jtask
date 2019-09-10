package com.tasks.java.miscellaneous;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Two string arrays are given one is for names and other is for equivalent surnames of the celebrities. program will just take the name as a input then find out the corresponding last name and the then print the whole name.
 * Scenario:
 * Enter the name:
 * harry
 * Full name of the celebrity is:
 * harry potter
 */
public class NameSearch {
	private static String[] names = {"harry", "michael", "will", "tom", "jackie"};
	private static String[] surnames = {"potter", "jackson", "smith", "cruise", "chan"};
	private static Map<String, String> fullNames = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter the name:");
		name = sc.next();
		if(fullNames.containsKey(name)) {
			System.out.println("Full name of the celebrity is:");
			System.out.println(name + " " + fullNames.get(name));
		} else {
			System.out.println("Wrong celebrity name");
			System.exit(0);
		}
	}

	static {
		int index = 0;
		for(String s : names) {
			fullNames.put(s, surnames[index]);
			index++;
		}
	}
}

