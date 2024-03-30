package com.tuf.array;

import java.util.Arrays;

public class ZeroOneAndTwos {

	public static int[] sort(int arr[],int n) {
		
		int cnt_0=0;
		int cnt_1=0;
		int cnt_2=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				cnt_0+=1;
			else if(arr[i]==1)
				cnt_1+=1;
			else
				cnt_2+=1;
		}

		for(int i=0;i<cnt_0;i++)
			arr[i]=0;
		
		for(int i=cnt_0;i<cnt_0+cnt_1;i++)
			arr[i]=1;
		
		for(int i=cnt_0+cnt_1;i<cnt_0+cnt_1+cnt_2;i++)
			arr[i]=2;
		
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public static void sort1(int arr[],int n) {
		int low=0;int mid=0;int high=n-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp = arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				int temp = arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int arr[]= {1,0,2,1,1,0,2,0,1};
		//sort(arr, arr.length);
		sort1(arr, arr.length);
		
	}
}
