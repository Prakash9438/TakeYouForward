package com.tuf.recurssion;

public class PrintName5Times {

	public static void printName(int i,int n) {
		if(i>n)
			return;
		System.out.println("Java : "+i);
		printName(i+1,n);
	}
	
	public static void main(String[] args) {
		printName(1,12);
	}
}
