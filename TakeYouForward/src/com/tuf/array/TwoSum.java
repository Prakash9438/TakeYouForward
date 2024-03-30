package com.tuf.array;

import java.util.Arrays;

public class TwoSum {

	public static int[] getSum(int arr[], int target) {
		int result[] = new int[2];
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if (arr[left] + arr[right] == target) {
				result[0] = left;
				result[1] = right;
				return result;
			} else if (arr[left] + arr[right] > target)
				right--;
			else
				left++;

		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 6, 5, 8, 11 };
		System.out.println(Arrays.toString(getSum(arr, 13)));
	}
}
