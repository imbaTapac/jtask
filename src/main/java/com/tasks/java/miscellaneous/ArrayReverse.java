package com.tasks.java.miscellaneous;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		int []arr = new int[10];
		int []result = new int[arr.length];
		int index = 0;
		int reverse;
		Scanner scan= new Scanner(System.in);
		for(int i =0;i<10;i++)
		{
			System.out.println("Enter the array elements["+i+"]:");
			arr[i]=scan.nextInt();
		}
		reverse = arr.length-1;
		while(index!=arr.length){
			result[index] = arr[reverse];
			index++;
			reverse--;
		}

		for(int i =0;i<10;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
}
