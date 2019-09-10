package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * A mathematician named Ulam proposed generating a sequence of numbers from any positive integer n (n > 0) is as follows:
 *
 * If n is 1, stop.
 * If n is even, the next number is n/2.
 * If n is odd, the next number is 3*n + 1.
 * Continue with this process until n reaches 1.
 *
 * Example :
 * 1.If user gives input integer 5 then Ulam Sequence will be in the below format:
 * 16 -> 8 -> 4 -> 2 -> 1
 *
 * 2.If user gives input integer 4 then Ulam Sequence will be in the below format:
 * 2 -> 1
 */
public class UlamSequence {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter your number :");
		number = sc.nextInt();
		if(number > 0) {
			while(number > 1) {
				number = (number % 2 == 0) ? (number / 2) : (3 * number + 1);
				sb.append(number);
				if(number > 1){
					sb.append(" -> ");
				}
			}
			System.out.println(sb.toString());
		} else {
			System.exit(0);
		}
	}
}
