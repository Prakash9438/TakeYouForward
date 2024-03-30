package com.tuf.array;

public class CountSubarraySumEqualToK {
	public static int getSumArrayCount(int arr[],int k) {
		int count=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(k==sum)
					count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 4};
        int k = 6;
		int sunArrayCount = getSumArrayCount(arr, k);
		System.out.println(sunArrayCount);
	}
}
