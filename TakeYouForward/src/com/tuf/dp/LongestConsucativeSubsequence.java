package com.tuf.dp;

import java.util.HashSet;
import java.util.Set;

public class LongestConsucativeSubsequence {

	public static int longest(int arr[],int n) {
		Set<Integer> set = new HashSet<Integer>();
		for(int a : arr)
			set.add(a);
		int longest=1;
		for(int a: arr) {
			if(!set.contains(a-1)) {
				int x = a;
				int count=1;
				while(set.contains(x+1)) {
					count+=1;
					x+=1;
				}
				longest= Math.max(count, longest);
			}
		}
		return longest;
	}
	
	public static void main(String[] args) {
		 int[] a = {100, 200, 1, 2, 3, 4};
		 System.out.println(longest(a, a.length));
	}
}
