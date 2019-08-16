package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * This is a program which takes input as a string and sort all the alphabets in string.
 *
 * Example :
 * 1.If user gives input "helloword" then output string should be "dehllloorw".
 *
 * 2. If user gives input "PROGRAMR" then output string should be "AGMOPRRR".
 */
public class AlphabetStringSorting {
	public static void main(String[] args) {
		String s = "";
		int maxId = 0;
		int prevId = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string :");
		s = sc.nextLine();
		char [] chars = s.toCharArray();

		for(int i =0;i<chars.length;i++){
			maxId = chars[i];
			for(int j = 0;j<chars.length;j++){
				if(maxId < chars[j]){
					prevId = maxId;
					maxId = chars[j];
					chars[i] = (char) maxId;
					chars[j] = (char) prevId;
				}
			}
		}

		System.out.println("Sorted string:\n"+String.valueOf(chars));
	}
}
