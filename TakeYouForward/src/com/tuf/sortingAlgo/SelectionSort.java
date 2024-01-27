package com.tuf.sortingAlgo;

import java.util.Arrays;

public class SelectionSort {

	//
	public static int[] sorting(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j=i;j<n;j++) {
				if(arr[j]<arr[min]) {
					//storing min elem index
					min=j;
				}
			}
			
			//swapping the min elem
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sorting(new int[] {13,46,24,52,20,9}, 6)));
	}
}
