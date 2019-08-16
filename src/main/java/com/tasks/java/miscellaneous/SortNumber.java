package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * A program which accepts 3 integers and sort them in ascending order.
 */
public class SortNumber {
	public static void main(String[] args) {
		int a, b, c;
		int max;
		int prev;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int[] mass = new int[]{a, b, c};
		for(int i = 0; i < mass.length; i++) {
			max = mass[i];
			for(int j = 0; j < mass.length; j++) {
				if(max < mass[j]) {
					prev = max;
					max = mass[j];
					mass[i] = max;
					mass[j] = prev;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(Integer x:mass) {
			sb.append(" ")
			.append(x);
		}
		System.out.println("Sorted numbers:"+sb.toString());
	}
}
