package com.tuf.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static long getRowandColNum(int n,int r) {
		long res=1;
		for(int i=0;i<r;i++) {
			res*=(n-i);
			res/=(i+1);
		}
		return res;
	}
	
	public static void printNthRow(int n) {
		long ans =1;
		System.out.print(1+" ");
		for(int i=1;i<n;i++) {
			ans*=(n-i);
			ans/=i;
			System.out.print(ans+" ");
		}
	}
	
	public static List<Long> NthRow(int n) {
		List<Long> list = new ArrayList<Long>();
		long ans =1;
		list.add(ans);
		for(int i=1;i<n;i++) {
			ans*=(n-i);
			ans/=i;
			//System.out.print(ans+" ");
			list.add(ans);
		}
		return list;
	}
	
	public static List<List<Long>> printTraingle(int n){
		List<List<Long>> triangle = new ArrayList<List<Long>>();
		for(int i=1;i<=n;i++) {
			List<Long> temp = new ArrayList<Long>();
			temp=NthRow(i);
			triangle.add(temp);
		}
		return triangle;
	}
	
	public static void main(String[] args) {
		//System.out.println(getRowandColNum(5-1, 3-1));
		//printNthRow(5);
		List<List<Long>> traingle = printTraingle(5);
		for(List<Long> l: traingle) {
			System.out.print(l);
			System.out.println();
		}
	}
}
