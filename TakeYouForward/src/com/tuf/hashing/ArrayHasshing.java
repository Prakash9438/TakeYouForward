package com.tuf.hashing;

public class ArrayHasshing {
	//liner search and return the count
	public static int bruteForce(int arr[],int n) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)
				count++;
		}
		return count;
	}
	
	//add the element to an arr based on its index and return that index value
	public static int usingHasshing(int arr[],int n) {
		int hash[]=new int[13];
		for(int i=0;i<arr.length;i++) {
			hash[arr[i]]++;
		}
		
		return hash[n];
	}
	
	public static void main(String[] args) {
		//System.out.println(bruteForce(new int[] {12,2,1,3,4,2,1,5,7}, 2));
		System.out.println(usingHasshing(new int[] {12,2,1,3,4,2,1,5,7}, 4));
		
	}
}
