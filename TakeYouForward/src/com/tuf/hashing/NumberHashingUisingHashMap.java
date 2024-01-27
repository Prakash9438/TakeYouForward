package com.tuf.hashing;

import java.util.HashMap;

public class NumberHashingUisingHashMap {

	public static int hasingUsingHashMap(int arr[],int n) {
		//creating hahmap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//adding elem to HashMap
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i],1);
		}
		
		//check if given no is present
		if(map.containsKey(n))
			return map.get(n);
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(hasingUsingHashMap(new int[] {12,2,1,3,4,2,1,5,7}, 9));
	}
}
