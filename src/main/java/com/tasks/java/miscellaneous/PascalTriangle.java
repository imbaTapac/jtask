package com.tasks.java.miscellaneous;

import java.util.Scanner;

public class PascalTriangle {
	private static final int FIRST_NUM = 1;
	private static final String UNDERSCORE = "_";

	public static void main(String[] args) {
		int val;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pascal val :");
		val = sc.nextInt();
		printPascalTriangle(val);
	}

	private static void printPascalTriangle(int val) {
		System.out.println(binomialCoefficient(14,4));
		StringBuilder sb = new StringBuilder();
		int underscoreCounter = val;
		int num;
		int triangleCoeff;
		for(int i = 0; i < val; i++) {
			for(int j = 0; j < underscoreCounter; j++) {
				sb.append(UNDERSCORE);
			}

			sb.append(FIRST_NUM);

			for(int b = 0; b < i; b++) {
				if(b != 0) {
					if(b == 1 || b == i - 1) {
						sb.append(UNDERSCORE);
						sb.append(i);
					} else if(b == 2 || b == i - 2) {
						triangleCoeff = i - 1;
						num = (triangleCoeff * (triangleCoeff + 1)) / 2;
						sb.append(UNDERSCORE);
						sb.append(num);
					} else if(b == 3) {
						int tetrahedronCoeff = i - 2;
						num = (tetrahedronCoeff * (tetrahedronCoeff + 1) * (tetrahedronCoeff + 2)) / 6;
						sb.append(UNDERSCORE);
						sb.append(num);
					} else {
						num = binomialCoefficient(i,b);
						sb.append(UNDERSCORE);
						sb.append(num);
					}
				}
			}

			if(i < 1) {
				sb.append(UNDERSCORE);
			} else {
				sb.append(UNDERSCORE)
						.append(FIRST_NUM)
						.append(UNDERSCORE);
			}
			sb.append("\n");
			underscoreCounter--;
		}
		System.out.println(sb.toString());
	}

	private static int binomialCoefficient(int n, int k){
		long top = 1;
		int result;
		for(int i = n; i > k; --i){
			top *= i;
		}
		result =  (int)(top / factorial(n - k));
		return result;
	}

	private static int factorial(int n){
		int fact = 1;
		for(int i = 2; i <= n; i++){
			fact *= i;
		}
		return fact;
	}
}
