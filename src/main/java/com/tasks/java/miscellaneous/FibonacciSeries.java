package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * This program  takes number as a input and prints the
 * Fibonacci series up to that range.
 */
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int termsCount;
		System.out.println("Enter count of terms ");
		termsCount = sc.nextInt();
		int[] sequence = new int[Math.abs(termsCount)];
		if(termsCount == 0) {
			System.out.println(0);
		} else if(termsCount == 1 || termsCount == -1) {
			System.out.println(0);
			System.out.println(1);
		} else {
			sequence[0] = 0;
			sequence[1] = 1;
			if(termsCount > 1) {
				for(int i = 2; i < termsCount; i++) {
					sequence[i] = calculateFibonacciNumber(sequence[i - 1], sequence[i - 2], false);
				}
				printSequence(sequence);
			} else {
				termsCount = Math.abs(termsCount);
				for(int i = 2; i < termsCount; i++) {
					sequence[i] = calculateFibonacciNumber(sequence[i - 1], sequence[i - 2], true);
				}
				printSequence(sequence);
			}
		}
	}

	private static int calculateFibonacciNumber(int num1, int num2, boolean isNegative) {
		return isNegative ? num2 - num1 : num1 + num2;
	}

	private static void printSequence(int sequence[]) {
		for(Integer b : sequence) {
			System.out.println(b);
		}
	}
}
