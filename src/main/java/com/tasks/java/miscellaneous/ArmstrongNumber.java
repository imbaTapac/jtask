package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * This is a program to take input integer from the user and check out the entered number is Armstrong or not.
 * Hint:
 * If sum of cubes of each digit of the number is equal to the number itself,
 * then the number is called an Armstrong number.
 * For example,
 * 153 = (1*1*1) + (5*5*5) + (3*3*3)
 */
public class ArmstrongNumber {
	public static void main(String[] args) {
		String num = "";
		int number = 0;
		int arm = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		num = sc.nextLine();
		number = Integer.parseInt(num);
		char[] chars = num.toCharArray();
		for(Character c : chars) {
			int a = Integer.parseInt(String.valueOf(c));
			arm += Math.pow(a, 3);
		}
		System.out.println("This is "+ (arm == number ? "armstrong" : "not armstrong") + " number");
	}
}
