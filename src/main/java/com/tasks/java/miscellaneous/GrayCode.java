package com.tasks.java.miscellaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Gray Code is a modified binary code in which sequential numbers are represented by expressions that differ only in one bit, to minimize errors.
 *
 * Write a program to calculate Gray code for given input number.
 *
 * For Ex:
 *
 * 1) Gray code for 2 is
 * 00
 * 01
 * 11
 * 10
 *
 * 2) Gray code for 3 is
 * 000
 * 001
 * 011
 * 010
 * 110
 * 111
 * 101
 * 100
 */
public class GrayCode {
	public static void main(String[] args) {
		int gCode;
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter your number of gray code :");
		gCode = sc.nextInt();
		int num = 0;
		generateGrayCode(gCode);

	}

	private static void generateGrayCode(int decimal) {
		if(decimal <= 0) {
			return;
		}
		List<String> gCodes = new ArrayList<>();

		gCodes.add("0");
		gCodes.add("1");

		for(int i = 2; i < (1 << decimal); i = i << 1) {

			for(int j = i - 1; j >= 0; j--) {
				gCodes.add(gCodes.get(j));
			}

			for(int j = 0; j < i; j++) {
				gCodes.set(j, "0" + gCodes.get(j));
			}

			for(int j = i; j < 2 * i; j++) {
				gCodes.set(j, "1" + gCodes.get(j));
			}
		}
		for(String code : gCodes) {
			System.out.println(code);
		}
	}
}
