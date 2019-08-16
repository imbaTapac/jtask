package com.tasks.java.miscellaneous;

import java.util.Scanner;

public class NumToString {
	public static final String ONES[] = {"one", "two", "three", "four", "five", "six", " seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen"
	};
	public static final String TENS[] = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};

	public static void main(String[] s) throws Exception {
		Scanner sc = new Scanner(System.in);
		Integer num;
		String number;
		String result;

		System.out.println("Enter the number:");
		num = sc.nextInt();
		number = num.toString();
		if(number.length() == 1) {
			char c = number.charAt(0);
			result = charToStr(c);
		} else if(number.charAt(0) == '1') {
			result = toOnes(number);
		} else {
			result = toTens(number);
		}


		System.out.println("Entered number is:");
		System.out.println(result);
	}

	public static String charToStr(char c) {
		String result = "";
		switch(c) {
			case '1':
				result = result + ONES[0];
				break;
			case '2':
				result = result + ONES[1];
				break;
			case '3':
				result = result + ONES[2];
				break;
			case '4':
				result = result + ONES[3];
				break;
			case '5':
				result = result + ONES[4];
				break;
			case '6':
				result = result + ONES[5];
				break;
			case '7':
				result = result + ONES[6];
				break;
			case '8':
				result = result + ONES[7];
				break;
			case '9':
				result = result + ONES[8];
				break;

		}
		return result;
	}

	public static String toOnes(String s) {
		char c = s.charAt(1);
		String result = "";
		switch(c) {
			case '0':
				result = result + ONES[9];
				break;
			case '1':
				result = result + ONES[10];
				break;
			case '2':
				result = result + ONES[11];
				break;
			case '3':
				result = result + ONES[12];
				break;
			case '4':
				result = result + ONES[13];
				break;
			case '5':
				result = result + ONES[14];
				break;
			case '6':
				result = result + ONES[15];
				break;
			case '7':
				result = result + ONES[16];
				break;
			case '8':
				result = result + ONES[17];
				break;
			case '9':
				result = result + ONES[18];
				break;

		}
		return result;
	}

	public static String toTens(String s) {
		String result = "";
		char a = s.charAt(0);
		char b = s.charAt(1);
		switch(a) {
			case '2':
				result = TENS[0] + " " + charToStr(b);
				break;
			case '3':
				result = TENS[1] + " " + charToStr(b);
				break;
			case '4':
				result = TENS[2] + " " + charToStr(b);
				break;
			case '5':
				result = TENS[3] + " " + charToStr(b);
				break;
			case '6':
				result = TENS[4] + " " + charToStr(b);
				break;
			case '7':
				result = TENS[5] + " " +charToStr(b);
				break;
			case '8':
				result = TENS[6] + " " + charToStr(b);
				break;
			case '9':
				result = TENS[7] + " " + charToStr(b);
				break;
		}
		return result;
	}
}
