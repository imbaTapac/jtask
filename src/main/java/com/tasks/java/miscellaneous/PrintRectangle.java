package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * Program which takes inputs of width and height of rectangle as integer and print the rectangle.
 */
public class PrintRectangle {
	public static void main(String[] args) {
		int width, height;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width:");
		width = scan.nextInt();
		System.out.println("Enter the height:");
		height = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < width; i++) {
			sb.append("*");
		}
		for(int i = 0; i < height - 2; i++) {
			sb.append("\n*");
			for(int j = 2; j < width; j++) {
				sb.append(" ");
			}
			sb.append("*");
		}
		sb.append("\n");
		for(int i = 0; i < width; i++) {
			sb.append("*");
		}
		System.out.println(sb.toString());
	}
}
