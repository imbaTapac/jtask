package com.tasks.java.miscellaneous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * If the string and the reverse of string are same then we say string is palindrome.
 * <p>
 * If string is "level" then the output should be: palindrome
 * <p>
 * <p>
 * <p>
 * If string is "helloworld" then the output should be: not a palindrome
 */
public class PalindromeString {
	public static void main(String[] args) throws IOException {
		String strn;
		String strr = "";
		boolean isPalindrome = false;
		System.out.println("Enter the string:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		strn = br.readLine();
		System.out.println("Result string is:");
		System.out.println(strn);
		for(int i = strn.length() - 1; i >= 0; i--) {
			strr = strr + strn.charAt(i);
		}
		System.out.println("Reverse string is :");
		System.out.println(strr);
		if(strn.equals(strr)) {
			isPalindrome = true;
		}

		if(isPalindrome) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

	}
}
