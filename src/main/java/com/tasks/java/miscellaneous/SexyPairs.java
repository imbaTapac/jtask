package com.tasks.java.miscellaneous;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Sexy Pairs are nothing but those pairs which contains prime numbers with difference of 6.
 * <p>
 * Consider 5 is a prime no. and adding 6 into 5 makes 11 which is also a prime no.
 * So (5,11) is a sexy pair.
 * For Ex:
 * <p>
 * 1) If user input 20 then it should print (5 11) (7 13) (11 17) (13 19) as
 * Sexy pairs.
 * <p>
 * 2) If user input 30 then it should print (5 11) (7 13) (11 17) (13 19)
 * (17 23) (23 29).
 */

public class SexyPairs {
	public static void main(String[] args) {
		int max;
		System.out.println("Enter Maximum No.:");
		Scanner sc = new Scanner(System.in);
		max = sc.nextInt();

		System.out.println("Sexy Pairs:" + sexyPrime(5, max));

	}

	public static String sexyPrime(int l, int r) {
		StringBuilder sexyPrime = new StringBuilder();
		boolean[] prime = new boolean[r + 1];

		Arrays.fill(prime, true);

		for(int p = 2; p * p <= r; p++) {
			// If prime[p] is not changed,
			// then it is a prime
			if(prime[p]) {
				// Update all multiples of p
				for(int i = p * 2; i <= r; i += p)
					prime[i] = false;
			}
		}

		// From L to R - 6, checking if i,
		// i + 6 are prime or not.
		for(int i = l; i <= r - 6; i++)
			if(prime[i] && prime[i + 6])
				sexyPrime.append("(")
						.append(i)
						.append((i+6))
						.append(") ");
		return sexyPrime.toString();
	}
}
