package com.tuf.recurssion;

import java.util.Arrays;

public class ReversingArray {

	public static int[] reverse(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len/2;i++) {
			int temp = arr[i];
			arr[i]=arr[len-1-i];
			arr[len-i-1]=temp;
		}
		return arr;
	}
	
	public static int[] usingRecurssion(int arr[],int i) {
		if(i>=arr.length/2)
			return arr;
		int temp = arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
		return usingRecurssion(arr, i+1);
	}
	
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(reverse(new int[] {1,2,3,4,2})));
		System.out.println(Arrays.toString(usingRecurssion(new int[] {1,2,3,4,5,6},0)));
	}
}
