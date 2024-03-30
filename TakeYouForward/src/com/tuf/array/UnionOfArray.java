package com.tuf.array;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfArray {

	public static int[] getUnionArray(int arr1[],int arr2[]) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i : arr1)
			set.add(i);
		for(int i : arr2)
			set.add(i);
		
		int union_array[] = new int[set.size()];
		
		int j=0;
		for(Integer i : set) {
			union_array[j]=i;
			j++;
		}
		System.out.println(Arrays.toString(union_array));
		return union_array;
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,1,2};
		int arr2[] = {1,2,3,7,2,9,2,6};
		getUnionArray(arr1, arr2);
	}
}
