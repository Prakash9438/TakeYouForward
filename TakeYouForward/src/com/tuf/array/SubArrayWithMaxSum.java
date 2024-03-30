package com.tuf.array;

public class SubArrayWithMaxSum {

	public static int getMaxSum(int arr[],int n) {
		int max = Integer.MIN_VALUE;
		int sum =0;
		int start =-1;
		int begin =-1;
		int end=-1;
		
		for(int i=0;i<n;i++) {
			if(sum==0)
				start=i;
			
			sum+=arr[i];
			
			//check if sum>masx then assign sum to max
			if(sum>max) {
				max= sum;
				begin=start;
				end=i;
			}
			
			//if sum is negative then assign sum to zero
			if(sum<0) {
				sum=0;
			}
				
		}
		
		for(int i=begin;i<=end;i++)
			System.out.print(arr[i]+" ");
		
		return max;
	}
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
		int maxSum = getMaxSum(arr, arr.length);
		System.out.println(maxSum);
	}
}
