package com.tuf.dp;

public class SetMatrixZero {

	public static int[][] setMatrixZero(int arr[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					markRow(arr, i, n);
					markCol(arr, j, m);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == -1)
					arr[i][j] = 0;
			}
		}

		return arr;
	}

	public static void markRow(int arr[][], int i, int n) {
		for (int j = 0; j < n; j++) {
			if (arr[i][j] != 0)
				arr[i][j] = -1;
		}

	}

	public static void markCol(int arr[][], int j, int m) {
		for (int i = 0; i < m; i++) {
			if (arr[i][j] != 0)
				arr[i][j] = -1;
		}
	}
	
	
	public static int[][] getMatrixZeroBetter(int arr[][],int n,int m){
		int row[]= new int[n];
		int col[]= new int[m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==0) {
					row[i]=-1;
					col[j]=-1;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==-1) {
					arr[i][j]=0;
				}
			}
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		int arr[][] = { { 0, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("********");
		int[][] setMatrixZero = setMatrixZero(arr, 3, 3);
		//int[][] matrixZeroBetter = getMatrixZeroBetter(arr, 3, 3);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(setMatrixZero[i][j] + " ");
			}
			System.out.println();
		}
	}
}
