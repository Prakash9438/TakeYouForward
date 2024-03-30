package com.tuf.sortingAlgo;

import java.util.Arrays;

public class QuickSort {

	public int fun(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i=low;
		int j=high;
		
		while(i<j) {
			while(arr[i]<=pivot && i<=high)
				i++;
			
			while(j>=low && arr[j]>pivot)
				j--;
			
			if(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp = arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		
		return j;		
	}
	
	public void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pivot = fun(arr,low,high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}
	
	public static void main(String[] args) {
		int arr[]=new int[] {4,6,2,5,7,9,1,3};
		int arr1[]=new int[] {1,2,4,8,9,2,0,1};
		System.out.println(Arrays.toString(arr1));
		new QuickSort().quickSort(arr1, 0, arr1.length-1);
		System.out.println(Arrays.toString(arr1));
	}
}
