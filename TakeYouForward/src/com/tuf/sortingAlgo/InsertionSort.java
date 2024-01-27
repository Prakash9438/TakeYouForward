package com.tuf.sortingAlgo;

import java.util.Arrays;

public class InsertionSort {

	public static int[] insertionSort(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int j=i;
			boolean flag = false;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
				flag = true;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(insertionSort(new int[] {13,24,46,52,20,9}, 6)));
		System.out.println(Arrays.toString(insertionSort(new int[] {5,1,2,3,4,5,6}, 6)));
	}
}
