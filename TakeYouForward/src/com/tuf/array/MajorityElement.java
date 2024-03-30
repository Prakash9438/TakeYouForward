package com.tuf.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MajorityElement {

	public static int getMajority(int arr[],int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i],map.get(arr[i])+1);
			else 
				map.put(arr[i], 1);
		}
		
		Set<Integer> set=map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer next = it.next();
			if(map.get(next)>n/2) {
				return next;
			}
				
		}
		
		System.out.println(map);
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {2,2,3,3,1,2,2};
		int majority = getMajority(arr, arr.length);
		System.out.println(majority);
		
	}
}
