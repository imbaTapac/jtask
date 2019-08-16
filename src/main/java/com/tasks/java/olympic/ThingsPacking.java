package com.tasks.java.olympic;

import static java.lang.Thread.currentThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Aaron collects things on vacation. He can carry luggage and luggage with him on the plane. He has a backpack for carry-on luggage, and a luggage for luggage.
 * According to the rules of carriage, the weight of hand luggage should not exceed S kg, and luggage can be of any mass (for extra luggage Aaron is ready to pay extra).
 * Of course, the most valuable things - a laptop, a camera, documents, etc. - Aaron wants to put in hand luggage.
 * Aaron arranged all his belongings in order of diminishing their value and began to put the most valuable things in a backpack. It works in this way - takes the most valuable item, and if its mass does not exceed S, then puts it in a backpack, otherwise puts it in a suitcase.
 * Then he takes the next item of value, if it can be put in a backpack, that is, if its mass, along with the mass of things already put in the backpack does not exceed S, then puts it in a backpack, otherwise to a suitcase, and in the same way the process lasts for all items in descending order of their value.
 * Determine the weight of the backpack and suitcases after Aaron folds all the things.
 * Input format:
 * The first line of input contains the number S (1 ≤ S ≤ 2 × 10^9) - the maximum allowable weight of the backpack. The second line of input contains the number N (1 ≤ N ≤ 10^5) - the number of items.
 * The following N lines give the masses of objects, the objects themselves are listed in descending order of value (first the mass of the most valuable object is indicated, then the mass of the second most valuable object, etc.). All numbers are natural, the sum of the weights of all objects does not exceed 2 × 109.
 * Output format:
 * Print two numbers - backpack weight and suitcase weight (empty backpack weight and suitcases are not included).
 */
public class ThingsPacking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int handLuggage;
		int thingsCount;
		int prevWeight = 0;
		int totalHandLuggageWeight = 0;
		int totalLuggageWeight = 0;
		List<Integer> things = new ArrayList<>();
		System.out.println("Enter weight of hand luggage :");
		handLuggage = sc.nextInt();
		System.out.println("Enter things count :");
		thingsCount = sc.nextInt();
		for(int i = 1; i <= thingsCount; i++) {
			int thingWeight;
			System.out.println("Enter weight of " + i + " thing:");
			thingWeight = sc.nextInt();
			things.add(thingWeight);
			if(i == 1) {
				prevWeight = thingWeight;
			} else if(i > 1 && thingWeight <= prevWeight) {
				prevWeight = thingWeight;
			} else {
				System.out.println("Things must goes in DESC order");
				currentThread().stop();
				break;
			}
		}
		for(Integer b : things) {
			if((totalHandLuggageWeight + b) <= handLuggage) {
				totalHandLuggageWeight += b;
			} else {
				totalLuggageWeight += b;
			}
		}
		System.out.println("Total hand luggage weight = " + totalHandLuggageWeight);
		System.out.println("Total luggage weight = " + totalLuggageWeight);
	}
}
