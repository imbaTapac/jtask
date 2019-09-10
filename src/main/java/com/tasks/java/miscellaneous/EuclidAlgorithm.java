package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * Implementation of Euclid Algorithm
 */
public class EuclidAlgorithm {
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		number1 = sc.nextInt();
		System.out.println("Enter second number");
		number2 = sc.nextInt();
		getFactory(number1,number2);
	}

	static void getFactory(int num1, int num2) {
		int r = num1 > num2 ? num1 % num2 : num2 % num1;
		while(r != 0) {
			num1 = num2;
			num2 = r;
			r = num1 % num2;
		}
		System.out.println(num2);
	}
}
