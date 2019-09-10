package com.tasks.java.arithmetic;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int octal;
		System.out.println("Enter your octal number : ");
		octal = sc.nextInt();
		System.out.println("Decimal is " + octalToDecimal(octal));
	}

	public static int octalToDecimal(int octal){
		String [] nums = String.valueOf(octal).split("");
		int decimal = 0;
		int pow = nums.length - 1;
		for(int i = 0; i < nums.length;i++){
			decimal+= Integer.parseInt(nums[i]) * (Math.pow(8,pow));
			pow --;
		}
		return decimal;
	}
}
