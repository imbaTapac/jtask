package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * This is the program which validates whether the given input year is Leap or Not Leap.
 */
public class LeapYearCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter year");
		year = sc.nextInt();
		if(year > 0) {
			System.out.println(year % 4 == 0 ? "Leap" : "Not leap");
		}
		else{
			System.out.println("Year cannot be zero or lower");
			System.exit(0);
		}
	}
}
