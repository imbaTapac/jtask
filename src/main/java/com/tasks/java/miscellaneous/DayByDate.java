package com.tasks.java.miscellaneous;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayByDate {
	private static Map<Integer, Integer> seasonCoefs = new HashMap<>();
	private
	static Map<Integer, Integer> yearCoefs = new HashMap<>();

	static {
		/**
		 * Where key is identifier of month (March - 3)
		 * Value is coefficient
		 */
		seasonCoefs.put(3, 4);
		seasonCoefs.put(4, 0);
		seasonCoefs.put(5, 2);
		seasonCoefs.put(6, 5);
		seasonCoefs.put(7, 0);
		seasonCoefs.put(8, 3);
		seasonCoefs.put(9, 6);
		seasonCoefs.put(10, 1);
		seasonCoefs.put(11, 4);
		seasonCoefs.put(12, 6);
		seasonCoefs.put(1, 1);
		seasonCoefs.put(2, 4);

		yearCoefs.put(16, 6);
		yearCoefs.put(17, 4);
		yearCoefs.put(18, 2);
		yearCoefs.put(19, 0);
		yearCoefs.put(20, 6);
		yearCoefs.put(21, 4);
		yearCoefs.put(22, 2);
	}

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd/mm/yyyy");
		String date = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your date (format dd/mm/yyyy): ");
		date = sc.nextLine();
		try {
			checkDate(date);
			Date d = sdf.parse(date);
			getDay(date);
		} catch(ParseException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	static void checkDate(String date) {
		String[] splited = date.split("/");
		if(splited.length < 3) {
			System.out.println("Wrong date");
		} else {
			int d = Integer.parseInt(splited[0]);
			int m = Integer.parseInt(splited[1]);
			int y = Integer.parseInt(splited[2]);
			if(d > 0 && m > 0 && y > 0) {
				if(m == 2 && (d <= 29 && y % 4 == 0) || (d <= 28 && y % 4 != 0)) {
					return;
				} else {
					System.out.println("Wrong date");
				}
			} else {
				System.out.println("Wrong date");
			}
		}
	}

	static void getDay(String date) {
		String[] splited = date.split("/");
		int d = Integer.parseInt(splited[0]);
		int m = Integer.parseInt(splited[1]);
		int y = Integer.parseInt(splited[2]);
		int day;
		int mCoef = seasonCoefs.get(m);
		int yEndSplited = Integer.parseInt(String.valueOf(y).substring(2));
		int yStartSplited = Integer.parseInt(String.valueOf(y).substring(0, 2));
		int yCoef = (yearCoefs.get(yStartSplited) + yEndSplited + yEndSplited / 4) % 7;
		if(y % 4 != 0) {
			day = (d + mCoef + yCoef) % 7;
		} else {
			if(m <= 2) {
				day = (d + mCoef + yCoef - 1) % 7;
			}
			else {
				day = (d + mCoef + yCoef) % 7;
			}
		}
		switch(day) {
			case 0:
				System.out.println("This is Sunday");
				break;
			case 1:
				System.out.println("This is Saturday");
				break;
			case 2:
				System.out.println("This is Monday");
				break;
			case 3:
				System.out.println("This is Tuesday");
				break;
			case 4:
				System.out.println("This is Wednesday");
				break;
			case 5:
				System.out.println("This is Thursday");
				break;
			case 6:
				System.out.println("This is Friday");
				break;
		}
	}
}
