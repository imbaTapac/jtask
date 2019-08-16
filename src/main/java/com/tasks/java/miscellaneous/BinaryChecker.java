package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * A binary number is written as combination of 1's and 0's.
 * Binary number 100 indicates 4.
 *
 *
 * For Ex:
 *
 * 1) if user inputs 1040400
 * then it should print "Not Binary".
 *
 * 2) if user inputs 1000100
 * then it should print "Binary".
 */
public class BinaryChecker {
	public static void main(String[] args) {

		Integer num;
		String number = "";
		boolean isBinary = false;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		number = num.toString();
		for(int i = 0;i<number.length();i++){
			if(number.charAt(i) == '1' || number.charAt(i) == '0'){
				isBinary = true;
			}
			else {
				isBinary = false;
				break;
			}
		}

		System.out.println("The number is:");
		if(isBinary){
			System.out.println("Binary");
		}
		else {
			System.out.println("Not Binary");
		}
	}
}
