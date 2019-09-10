package com.tasks.java.miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * This is a program which takes input as string and then implement the logic to find out Uppercase Consonants,Lowercase Consonants,Uppercase Vowels,Lowercase Vowels in string.
 */
public class VowelsAndConsonants {
	public static void main(String[] args) {
		List<Character> consonants = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z');
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');
		int upperCaseConsonants = 0;
		int lowerCaseConsonants = 0;
		int upperCaseVowels = 0;
		int lowerCaseVowels = 0;
		Scanner sc = new Scanner(System.in);
		String s = "";
		System.out.println("Enter your text");
		s = sc.nextLine();
		char[] chars = s.toCharArray();
		for(Character c : chars) {
			if(Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
				if(consonants.contains(c)) {
					upperCaseConsonants++;
				} else if(vowels.contains(c)) {
					upperCaseVowels++;
				}
			} else {
				if(consonants.contains(c)) {
					lowerCaseConsonants++;
				} else if(vowels.contains(c)) {
					lowerCaseVowels++;
				}
			}
		}
		System.out.println("Uppercase Consonants = " + upperCaseConsonants + ".");
		System.out.println("Lowercase Consonants = " + lowerCaseConsonants + ".");
		System.out.println("Uppercase Vowels = " + upperCaseVowels + ".");
		System.out.println("Lowercase Vowels = " + lowerCaseVowels + ".");
	}
}
