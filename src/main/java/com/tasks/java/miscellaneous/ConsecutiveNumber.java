package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * This program checking the given number is consecutive OR not
 */
public class ConsecutiveNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter your number : ");
		number = sc.nextInt();
		System.out.println("Given number is " + (isConsecutive(number)? "consecutive" : "not a consecutive"));
	}

	private static boolean isConsecutive(int num) {
		boolean isConsecutive = false;
		if(num < 0) {
			num = Math.abs(num);
		}
		String[] splittedNumber = String.valueOf(num).split("(?<=.)");
		int prev = Integer.parseInt(splittedNumber[0]);
		for(int i = 0; i < splittedNumber.length; i++) {
			if(Integer.parseInt(splittedNumber[i]) >= prev) {
				isConsecutive = true;
			} else {
				isConsecutive = false;
				break;
			}
			prev = Integer.parseInt(splittedNumber[i]);
		}
		return isConsecutive;
	}
}
