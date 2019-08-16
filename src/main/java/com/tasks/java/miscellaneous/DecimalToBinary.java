package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * This is a program that will take input number from user and will display its binary equivalent.
 */

public class DecimalToBinary {
	public static void main(String[] args) {
		int decimal;
		int count = 0;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your decimal");
		decimal = sc.nextInt();
		StringBuilder binary = new StringBuilder();
		while(decimal > 0) {
			a = decimal % 2;
			if(a == 1) {
				count++;
			}
			binary.append(a);
			decimal = decimal / 2;
		}
		System.out.println(binary.reverse().toString());
	}
}
