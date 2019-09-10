package com.tasks.java.miscellaneous;

import java.util.Scanner;

/**
 * This is the program which accepts elements for a matrix of size 3x3 i.e. 9 elements and show transpose matrix for it.
 * <p>
 * For ex:
 * <p>
 * 1) If given elements are 1,2,3,4,5,6,7,8,9 then Its matrix will be
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * and its transpose matrix output should be
 * 1 4 7
 * 2 5 8
 * 3 6 9.
 * <p>
 * 2) If elements are 34,15,86,35,12,7,2,75,44
 * its normal matrix form is
 * 34 15 86
 * 35 12 7
 * 2 75 44
 * and its transpose matrix output should be
 * 34 35 2
 * 15 12 75
 * 86 7 44
 */
public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size of matrix ");
		n = sc.nextInt();
		if(n > 0) {
			int[][] matrix = new int[n][n];
			fillMatrix(matrix, sc);
			MatrixMultiplication.printMatrix(matrix);
			matrix = transposeMatrix(matrix);
			System.out.println("Transposed matrix ");
			MatrixMultiplication.printMatrix(matrix);
		} else {
			System.out.println("Size cannot be zero or lower");
			System.exit(0);
		}
	}

	private static int[][] fillMatrix(int[][] matrix, Scanner sc) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				System.out.println("Matrix [" + i + "][" + j + "]:");
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

	private static int[][] transposeMatrix(int[][] matrix) {
		int [][] transposedMatrix = new int[matrix.length][matrix.length];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				transposedMatrix[j][i] = matrix[i][j];
			}
		}
		return transposedMatrix;
	}
}
