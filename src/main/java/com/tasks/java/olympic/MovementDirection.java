package com.tasks.java.olympic;

import java.util.Scanner;

public class MovementDirection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = "N";
		String S = "S";
		String W = "W";
		String E = "E";
		int x1, y1, x2, y2, x, y;
		System.out.println("Enter coordinate (x1)");
		x1 = sc.nextInt();
		System.out.println("Enter coordinate (y1)");
		y1 = sc.nextInt();
		System.out.println("Enter coordinate (x2)");
		x2 = sc.nextInt();
		System.out.println("Enter coordinate (y2)");
		y2 = sc.nextInt();
		System.out.println("Enter your coordinate (x)");
		x = sc.nextInt();
		System.out.println("Enter your coordinate (y)");
		y = sc.nextInt();

		if(x1 < x2 && y1 < y2 && x != x1 && x != x2 && y != y1 && y != y2) {
			if(x < x2 && x > x1 && y > y2) {
				System.out.println("N");
			} else if(x < x2 && x > x1 && y < y1) {
				System.out.println("S");
			} else if(x > x1 && y < y2 && y > y1) {
				System.out.println("W");
			} else if(x < x1 && y < y2 && y > y1) {
				System.out.println("E");
			} else if(x < y1 && y > y2) {
				System.out.println("NW");
			} else if(x > y1 && y > y2) {
				System.out.println("NE");
			} else if(x < y1 && y < y1) {
				System.out.println("SW");
			} else if(x > y1 && y < y1) {
				System.out.println("SE");
			}
		}else{
			System.out.println("You in the plot");
		}
	}
}
