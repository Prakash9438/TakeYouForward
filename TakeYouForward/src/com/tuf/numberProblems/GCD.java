package com.tuf.numberProblems;

public class GCD {

	//Euclidian method to get GCD
	//Time : O(logi min(a,b))
	public static int getGCD(int a,int b) {
		while(a>0 && b>0) {
			if(a>b) a=a%b;
			else b=b%a;
		}
		if(a==0) return b;
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(getGCD(12, 15));
	}
}
