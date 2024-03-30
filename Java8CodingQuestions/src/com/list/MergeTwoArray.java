package com.list;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {

	//merge two unsorted array and return sorted array
	//use concat(stream,stream) method from IntStream Interface
	public static int[] getMergeArray() {
		int arr1[] = new int[] {7,1,9};
		int arr2[] = new int[] {3,4,2};
		
		int[] sortedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		System.out.println(Arrays.toString(sortedArray));
		
		return sortedArray;
	}
	
	public static int[] mergeTwoArrayWithoutDuplicate() {
		int arr1[] = new int[] {7,1,9,1,6,7};
		int arr2[] = new int[] {3,4,2,3,2,8};
		
		int[] distinctArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
				.sorted().distinct().toArray();
		
		System.out.println(Arrays.toString(distinctArray));
		return distinctArray;
	}
	
	public static void main(String[] args) {
		//getMergeArray();
		mergeTwoArrayWithoutDuplicate();
	}
}
