package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * This is a program to implement a code for making reverse Flyod's triangle using loops. Floyd's Triangle: It is a pattern of numbers arranging in below format :
 * 7_8_9_10_
 * 4_5_6_
 * 2_3_
 * 1_
 */
public class ReverseFloydTriangle {
	public static void main(String[] args) {
		int size = 0;
		int counter;
		int prev = 0;
		int max = 0;
		int startFrom = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of triangle : ");
		size = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		max = calculateMax(size);
		startFrom = max - size + 1;
		for(int i = size; i != 0; i--) {
			counter = 0;
			prev = startFrom;
			while(counter != i) {
				sb.append(startFrom)
						.append("_");
				startFrom++;
				counter++;
			}
			startFrom = prev - i + 1;
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

	static int calculateMax(int size) {
		int max = 0;
		int counter;
		for(int i = 0; i <= size; i++) {
			counter = 0;
			while(counter != i) {
				counter++;
				max++;
			}
		}
		return max;
	}
}
