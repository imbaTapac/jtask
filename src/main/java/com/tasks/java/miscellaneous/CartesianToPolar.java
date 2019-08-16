package com.tasks.java.miscellaneous;

import java.util.Scanner;

public class CartesianToPolar {
	public static void main(String[] args) {
		double x;
		double y;
		double r;
		double theta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		x = sc.nextInt();
		System.out.println("Enter y:");
		y = sc.nextInt();
		r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		theta = Math.atan2(y, x);
		System.out.println(r);
		System.out.println(theta);
	}
}
