package com.tuf.sortingAlgo;

import java.util.Arrays;

public class BubbleSort {

	public static int[] bubbleSort(int arr[],int n) {
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] bubbleSort1(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(bubbleSort1(new int[] {13,24,46,52,20,9}, 6)));
	}
}
