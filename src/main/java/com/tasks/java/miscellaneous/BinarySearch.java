package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * Implementation of binary search algorithm (recursive/iterative)
 */
public class BinarySearch {
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix ");
		size = sc.nextInt();
		if(size > 1) {
			int[] arr = new int[size];
			fillMatrix(arr, sc);
			System.out.println("Enter the element you wanna to find ");
			int x = sc.nextInt();
			int n = arr.length;
			int result = recursiveSearch(arr, 0, n - 1, x);
			System.out.println(result == -1 ? "Element is not present" : "Element " + x + " present at " + result + " index");
		} else {
			System.out.println("Size of array cannot be lower than one element");
			System.exit(0);
		}
	}

	private static int recursiveSearch(int[] arr, int l, int r, int x) {
		if(r >= l) {
			int mid = l + (r - l) / 2;

			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid] > x) {
				return recursiveSearch(arr, l, mid - 1, x);
			}

			return recursiveSearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	private static int iterativeSearch(int[] arr, int l, int r, int x) {
		while(l <= r) {
			int mid = l + (r - l) / 2;

			if(arr[mid] == x) {
				return mid;
			}

			if(arr[mid] < x) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return -1;
	}

	private static void fillMatrix(int[] arr, Scanner sc) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the [" + (i + 1) + "] element");
			arr[i] = sc.nextInt();
		}
	}
}
