package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * An algorithm given by Lothar Collatz produces sequences of integers, and is described as follows:
 * <p>
 * Step 1: Choose an arbitrary positive integer A as the first item in the sequence.
 * Step 2: If A = 1 then stop.
 * Step 3: If A is even, then replace A by A / 2 and go to step 2.
 * Step 4: If A is odd, then replace A by 3 * A + 1 and go to step 2.
 * <p>
 * This is a program which calculates Collatz Sequence.
 * <p>
 * for ex:
 * <p>
 * 1) the collatz sequence for 7 is 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
 * 2) the collatz sequence for 15 is 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1.
 */
public class CollatzSequence {
	public static void main(String[] args) {
		int decimal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your decimal:");
		decimal = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		if(decimal > 0) {
			sb.append(decimal);
			while(decimal != 1) {
				if(decimal % 2 == 0) {
					decimal = decimal / 2;
				} else {
					decimal = decimal * 3 + 1;
				}
				sb.append(" ")
						.append(decimal);
			}
			System.out.println("Collatz Sequence is :" + sb.toString());
		} else {
			System.exit(0);
		}
	}
}
