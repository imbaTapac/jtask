package com.tasks.java.miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * This is a program which accepts an Integer which is an Angle and prints the Quadrant number in which it is.
 * <p>
 * For Ex.
 * 1) if user input 30 then it should print 1.
 * 2) if user input 197 then it should print 3.
 */
public class QuadrantOfAngle {

	public static void main(String[] args) {
		int angle = 0;
		Predicate<Integer> firstQuarter = integer -> integer >= 0 && integer <= 90;
		Predicate<Integer> secondQuarter = integer -> integer >= 90 && integer <= 180;
		Predicate<Integer> thirdQuarter = integer -> integer >= 180 && integer <= 270;
		Predicate<Integer> fourthQuarter = integer -> integer >= 270 && integer <= 360;
		List<Predicate<Integer>> predicateList = Arrays.asList(firstQuarter,secondQuarter,thirdQuarter,fourthQuarter);

		System.out.println("Type an integer angle (in degrees) and press Enter:");
		Scanner sc = new Scanner(System.in);
		angle = sc.nextInt();

		for(Predicate p : predicateList) {
			if(p.test(angle)) {
				System.out.println("Quadrant is:" + (predicateList.indexOf(p) + 1));
				break;
			}
		}
	}

}
