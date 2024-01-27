package com.tuf.recurssion;

public class FibonacciSeries {
	
	public static void fib(int n) {
		int a=1,b=0,c=0;
		for(int i=1;i<=n;i++) {
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
		}
	}
	
	public static int fibRecurssin(int n) {
		if(n<=1)
			return n;
		return fibRecurssin(n-1)+fibRecurssin(n-2);
	}
	
	public static void main(String[] args) {
		//fib(5);
		System.out.println("Recurssion : "+fibRecurssin(5));
	}

}
