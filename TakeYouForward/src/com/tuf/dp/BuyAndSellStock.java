package com.tuf.dp;

public class BuyAndSellStock {

	public static int buyandSell(int arr[],int n) {
		int profit=0;
		int min=arr[0];
		for(int i=1;i<n;i++) {
			int cost = arr[i]-min;
			profit=Math.max(profit, cost);
			min=Math.min(arr[i], min);
		}
		return profit;
	}
	
	public static void main(String[] args) {
		int arr[]= {7,1,5,3,6,4,9};
		System.out.println(buyandSell(arr, arr.length));
	}
}
