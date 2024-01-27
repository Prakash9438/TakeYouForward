package com.tuf.recurssion;

public class PrintNtoOne {
	
	public static void printNtoOne(int n) {
		if(n<1)
			return;
		System.out.println(n);
		printNtoOne(n-1);
		
	}
	
	public static void main(String[] args) {
		printNtoOne(10);
	}

}
