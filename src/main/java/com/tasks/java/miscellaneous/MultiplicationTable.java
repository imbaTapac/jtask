package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * This is the program which takes integer number and prints the table of that number.
 * <p>
 * Example :
 * 1.If user gives input 2 then output table should be in the below format :
 * 2
 * 4
 * 6
 * 8
 * 10
 * 12
 * 14
 * 16
 * 18
 * 20
 */
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter your integer to get multiplication table");
		num = sc.nextInt();
		if(num > 0) {
			for(int i = 1; i <= 10; i++) {
				System.out.println(num * i);
			}
		} else {
			System.out.println("Number cannot be zero or lower");
			System.exit(0);
		}
	}
}
