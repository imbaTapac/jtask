package com.tasks.java.olympic;

import java.util.Scanner;

public class GroupDividing {
	public static void main(String[] args) {
		int num = 0;
		int n2= 1;
		int k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		num = sc.nextInt();
		while(n2<=num){
			n2=n2*2;
			System.out.println(n2);
			System.out.println(k);
			k=k+1;
			System.out.println(k);
		}
	}
}
