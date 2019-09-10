package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * An ISBN number is legal if it consists of 10 digits and
 *
 * d_1 + 2*d_2 + 3*d_3 + ... + 10*d_10 is a multiple of 11.
 * This is the program which validate ISBN
 */
public class ISBNValidator {
	public static void main(String[] args) {
		String isbn = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ISBN num :");
		isbn = sc.nextLine();
		if(isbn.length() > 10) {
			System.out.println("ISBN num cannot be greater than 10");
		} else {
			int sum = 0;
			int counter = isbn.length();
			char[] chars = isbn.toCharArray();
			for(char c : chars) {
				int b = Integer.parseInt(String.valueOf(c));
				sum += counter * b;
				counter--;
			}
			System.out.println("The ISBN number is: " + (sum % 11 == 0 ? "Valid" : " Invalid"));
		}
	}
}