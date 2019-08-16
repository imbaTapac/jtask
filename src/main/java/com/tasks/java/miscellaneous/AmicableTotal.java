package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * Amicable numbers are two different numbers, such that the sum of the proper divisors of each is equal to the other number.
 *
 * Consider a number 220
 * The divisor of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110, of which the sum is 284.
 * now consider the 284
 * the divisors of 284 are 1, 2, 4, 71 and 142 and sum of all these is 220.
 * hence 220,284 are amicable numbers.
 *
 * This is a program which accepts an integer input as limit up to which it print sum of all amicable numbers.
 */
public class AmicableTotal {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("This is " + (isAmicable(num) ? "amicable" : "not amicable")+ " numbers");
	}

	static int checkAmicable(int num) {
		int amicableTotal = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				amicableTotal += i;
			}
		}
		return amicableTotal;
	}

	static boolean isAmicable(int num){
		int amicableTotal = checkAmicable(num); //284
		int reverse = checkAmicable(amicableTotal);
		System.out.println("The total is:" + amicableTotal + " " + reverse);
		return reverse == num;
	}
}
