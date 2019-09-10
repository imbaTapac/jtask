package com.tasks.java.miscellaneous;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int [][]array = new int[3][3];
		int [][]array1 = new int[3][3];
		int [][]result = new int[3][3];

		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Matrix 1st [" + i + "][" + j + "]:");
				array[i][j] = scan.nextInt();
			}
		}

		printMatrix(array);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Matrix 2nd [" + i + "][" + j + "]:");
				array1[i][j] = scan.nextInt();
			}
		}
		printMatrix(array1);
		System.out.println("Multiply of both matrix:");

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int index = 0;
				while(array1.length>index){
					System.out.println("\nThe pair is "+array[i][index] + " * " +array1[index][j] );
					result[i][j] += array[i][index] * array1[index][j];
					index++;
				}
				System.out.print("Result of multiplication is "+result[i][j]);
			}
			System.out.println();

		}
		printMatrix(result);
	}

	public static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}
