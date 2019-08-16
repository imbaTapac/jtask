package com.tasks.java.miscellaneous;

import java.util.Scanner;

public class BinaryTriangle {
	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of triangle:");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		System.out.println("Triangle is:");

		int c = toDecimal("10101");
	}

	public static int toDecimal(String binary) {
		int decimal = 0;
		String bins[] = binary.split("(?<=([01]))(?!\\1)");
		for(int i = bins.length-1; i!=-1; i--) {
			if(bins[i].equals("1")) {
				decimal += (int) Math.pow(2, i);
			} else {
				decimal += 0 * Math.pow(2, i);
			}
		}
		return decimal;
	}

	public static String toBinary(int decimal){
		StringBuilder binary = new StringBuilder();
		int a;
		int count;
		int j;
		for(int i = 1; i <= decimal; i++) {
			count = 0;
			j = i;
			while(j > 0) {
				a = j % 2;
				if(a == 1) {
					count++;
				}
				binary.append(a);
				j = j / 2;
			}
			binary.append("\n");
		}
		return binary.reverse().toString();
	}
}
