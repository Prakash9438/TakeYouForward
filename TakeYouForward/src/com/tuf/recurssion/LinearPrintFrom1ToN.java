package com.tuf.recurssion;

public class LinearPrintFrom1ToN {
	public static void linearPrint(int i,int n) {
		if(i>n)
			return;
		System.out.println(i);
		linearPrint(i+1, n);
	}
	
	public static void main(String[] args) {
		linearPrint(1,17);
	}

}
