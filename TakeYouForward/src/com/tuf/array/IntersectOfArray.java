package com.tuf.array;

import java.util.ArrayList;

public class IntersectOfArray {

	public static ArrayList<Integer> getIntersectArray(int arr1[],int arr2[]) {
		ArrayList<Integer> intersect = new ArrayList<Integer>();
		
		int visited[] = new int[arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j] && visited[j]==0) {
					intersect.add(arr1[i]);
					visited[j]=1;
					break;
				}
				if(arr2[j]>arr1[i])
					break;
			}	
		}
		System.out.println(intersect);
		return intersect;
	}
	
	public static ArrayList<Integer> optimal(int arr1[],int arr2[]){
		int i=0;int j=0;
		int n1 = arr1.length;
		int n2 = arr2.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr1[i]>arr2[j])
				j++;
			else {
				list.add(arr1[i]);
				i++;
				j++;
			}
		}
		System.out.println(list);
		return list;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 3, 4, 5, 6, 7 };
		int arr2[] = { 3, 3, 4, 4, 5, 8 };
		
		//getIntersectArray(arr1, arr2);
		optimal(arr1, arr2);
	}
}
