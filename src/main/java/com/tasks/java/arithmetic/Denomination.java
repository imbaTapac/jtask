package com.tasks.java.arithmetic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * A bank intends to design a program to display the denomination of an input amount. The available denomination with the bank are of rupees 1000 , 500 , 100 , 50 , 20 , 10 , 5 , 2 , and 1.
 *
 * Design a program to accept the amount from the user and display the break-up in descending order of denomination. (i.e. preference should be given to the highest denomination available) along with the total number of notes.
 * [Note: Only the denomination used, should be displayed].
 */
public class Denomination {
	private static List<Integer> denominations = Arrays.asList(1000, 500, 100, 50, 20, 10, 5, 2, 1);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount;
		System.out.println("Enter the amount :");
		amount = sc.nextInt();
		if(amount > 0) {
			TreeMap<Integer, Integer> notesCount = new TreeMap<>();
			for(Integer note : denominations) {
				notesCount.put(note, 0);
			}
			while(amount != 0) {
				for(Integer note : denominations) {
					if((amount - note) >= 0) {
						amount -= note;
						int count = notesCount.get(note);
						notesCount.replace(note, count + 1);
					}
				}
			}
			for(Map.Entry entry : notesCount.descendingMap().entrySet()) {
				if((int)entry.getValue()!=0) {
					System.out.println("Count of " + entry.getKey() + " is " + entry.getValue());
				}
			}
		} else {
			System.out.println("Amount cannot be zero or lower");
		}
	}
}
