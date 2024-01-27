package com.tuf.recurssion;

public class SummationOfNno {

	public static int summatin(int n) {
		if(n==1)
			return 1;
		return n+summatin(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(summatin(3));
	}
}
