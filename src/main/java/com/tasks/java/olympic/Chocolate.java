package com.tasks.java.olympic;

import java.util.Scanner;

/**
 * Aaron decided to treat his classmates with chocolates.
 * The chocolate cost N UAH. Since November 1, the cost of chocolate has increased exactly by P percent.
 * Determine how many chocolates Aaron will be able to buy at UAH S after rising in price.
 * Input format:
 * The first line contains the number N (1 ≤ N ≤ 107) - the value of the chocolate before rising.
 * In the second line P (0 ≤ P ≤ 100) - the value of the chocolate price increase as a percentage.
 * In the third line - S (1 ≤ S ≤ 107) - the amount of money that Aaron has.
 * Output format:
 * Print one number - the number of chocolates that Aaron can buy.
 */
public class Chocolate {
	public static void main(String[] args) {
		int chocoCost;
		int priceIncrease; //percentage
		int amountOfMoney;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cost of chocolate");
		chocoCost = sc.nextInt();
		System.out.println("Enter chocolate price increase");
		priceIncrease = sc.nextInt();
		if(priceIncrease < 0 || priceIncrease > 100) {
			System.out.println("Price increase can be only between 0 and 100, cause it is percentage");
		} else {
			System.out.println("Enter amount of money that you have");
			amountOfMoney = sc.nextInt();
			if(amountOfMoney < 1 || amountOfMoney > Integer.MAX_VALUE - 1) {
				System.out.println("Wrong money amount");
			} else {
				double totalChocolate = amountOfMoney / (chocoCost + ( (double) priceIncrease / 100));
				System.out.println("Total chocolate is " + (int)totalChocolate);
			}
		}

	}
}
