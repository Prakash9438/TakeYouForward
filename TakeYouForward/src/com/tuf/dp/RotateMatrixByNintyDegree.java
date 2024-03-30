package com.tuf.dp;

public class RotateMatrixByNintyDegree {

	public static int[][] rotateMatrix(int arr[][]) {
		// Creating another matrix to store the result
		int reverse[][] = new int[arr.length][arr[0].length];
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				reverse[j][n - i - 1] = arr[i][j];
			}
		}
		for (int i = 0; i < reverse.length; i++) {
			for (int j = 0; j < reverse[0].length; j++) {
				System.out.print(reverse[i][j] + " ");
			}
			System.out.println();
		}

		return reverse;
	}

	public static int[][] rotateMatrixOptimal(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
		return arr;
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("*********");
		//int[][] rotateMatrix = rotateMatrix(arr);
		rotateMatrixOptimal(arr);

	}
}
