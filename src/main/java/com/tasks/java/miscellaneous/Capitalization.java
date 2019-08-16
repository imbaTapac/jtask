package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * A program which takes an input string and capitalizes only the first character of each word in the string, and does not affect the others.
 */
public class Capitalization {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s;
		s = input.nextLine();
		String reString = "";
		String[] words = s.split(" ");
		for(String o : words) {
			char c = o.charAt(0);
			reString += o.replace(c, Character.toUpperCase(c)) + " ";
		}

		System.out.println("Result string:\n" + reString);
	}
}
