package com.tasks.java.miscellaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.google.common.annotations.Beta;

/**
 * This is the program to display all possible permutations of a given input string
 * if the string contains duplicate characters, result repeats.
 * contains {@link Beta} methods
 */
public class StringPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter your string ");
		s = sc.nextLine();
		distinctPermutation(s, "");
	}

	private static void recursivePermutation(String origin, String ans) {
		if(origin.length() == 0) {
			System.out.println(ans + " ");
			return;
		}

		for(int i = 0; i < origin.length(); i++) {
			char ch = origin.charAt(i);
			String ros = origin.substring(0, i) +
					origin.substring(i + 1);

			recursivePermutation(ros, ans + ch);
		}
	}

	private static void distinctPermutation(String origin, String ans) {
		if(origin.length() == 0) {
			System.out.println(ans + " ");
			return;
		}

		boolean[] alpha = new boolean[26];

		for(int i = 0; i < origin.length(); i++) {

			char ch = origin.charAt(i);

			String ros = origin.substring(0, i) +
					origin.substring(i + 1);

			if(!alpha[ch - 'a']) {
				distinctPermutation(ros, ans + ch);
			} else {
				alpha[ch - 'a'] = true;
			}
		}
	}

	@Beta
	private static void permutateString(String s) {
		String origin = s;
		List<String> permutatedStrings = new ArrayList<>();
		permutatedStrings.add(s);
		int combinations = calculateCombination(s);
		s = permutate(s);
		permutatedStrings.add(s);
		while(permutatedStrings.size() != combinations) {
			s = permutate(s);
			if(origin.equals(s) && permutatedStrings.size() != combinations) {
				s = permutate(s);
			}
			if(!permutatedStrings.contains(s)) {
				permutatedStrings.add(s);
			}
		}
		for(String b : permutatedStrings) {
			System.out.println(b);
		}
	}

	@Beta
	private static String permutate(String s) {
		int c = ThreadLocalRandom.current().nextInt(0, s.length());
		int a = ThreadLocalRandom.current().nextInt(0, s.length());
		while(a == c) {
			a = ThreadLocalRandom.current().nextInt(0, s.length());
		}
		char[] chars = s.toCharArray();
		char r = chars[c];
		chars[c] = chars[a];
		chars[a] = r;
		return String.valueOf(chars);
	}

	private static int calculateCombination(String s) {
		int res = 1;
		for(int i = 1; i < s.length(); i++) {
			res += res * i;
		}
		return res;
	}
}
