package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * Write a program which accepts an integer as a decimal number and prints its octal form.
 * An Octal number can be expressed as a combination of 0 to 7 no.
 */

public class DecimalToOctal {
	public static void main(String[] args) {
		int decimal;
		int count = 0;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		decimal = sc.nextInt();
		StringBuilder octal = new StringBuilder();

		while(decimal > 0){
			a = decimal % 8;
			if(a == 1) {
				count++;
			}
			octal.append(a);
			decimal = decimal / 8;
		}
		System.out.println(octal.reverse().toString());
	}
}
