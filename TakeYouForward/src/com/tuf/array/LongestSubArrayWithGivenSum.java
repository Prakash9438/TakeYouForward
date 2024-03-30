package com.tuf.array;

import java.util.ArrayList;
import java.util.List;

public class LongestSubArrayWithGivenSum {

	// Brute Force TC : O(n3)
	public static int getLongestArray(int arr[], int q) {
		int sum = 0;
		int maxLen = 0;
		int n = arr.length;
		List<Integer> list = null;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				if (sum == q) {
					// maxLen = Math.max(maxLen, j - i + 1);
					if (maxLen < (j - i + 1)) {
						maxLen = (j - i + 1);
						list = new ArrayList<Integer>();
						for (int l = i; l <= j; l++)
							list.add(arr[l]);
					}

				}
			}
		}
		System.out.println(list);
		return maxLen;
	}

	//Brute force
	public static int getLongestArray1(int arr[], int q) {
		int sum = 0;
		int maxLen = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			sum=0;
			for (int j = i; j < n; j++) {
				sum+=arr[j];
				if (sum == q) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
			}
		}
		return maxLen;
	}
	
	//Better 
	
	
	/*
	 * Optimal [Two pointer approach]
	 */
	public static int getLongestArray2(int arr[], int q) {
		int sum = arr[0];
		int maxLen = 0;
		int n = arr.length;
		int left=0;
		int right=0;
		while(right<n) {	
			//if sum > k then substrate left element from sum and increase left
			while(left<=right && sum>q) {
				sum-=arr[left];
				left++;
			}
			//if sum==q then find the array length
			if(sum==q) {
				maxLen=Math.max(maxLen, right-left+1);
			}
			
			right++;
			//if left less than n then add that elem to sum
			if(right<n) {
				sum+=arr[right];
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 1, 9 };
		//System.out.println(getLongestArray(arr, 10));
		//System.out.println(getLongestArray1(arr, 10));
		System.out.println(getLongestArray2(arr, 10));
	}
}
