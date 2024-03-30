package com.string;

import java.util.Arrays;

import com.list.FrequencyOfEachCharacter;

public class StringQuestions {

	//Check whether a character is a alphabet or not 
	public static boolean isCharacter(char ch) {
		System.out.println(Character.isAlphabetic(ch));
		return Character.isAlphabetic(ch);
	}
	
	//Length of the string without using strlen() function
	public  static int getLength(String str) {
		int c=0;
		for(char ch : str.toCharArray()) {
			c++;
		}
		System.out.println(c);
		return c;
	}
	
	//Toggle each character in a string
	public static String toggleString(String str) {
		String s="";
		for(char ch : str.toCharArray()) {
			if(ch>='a' && ch<='z')
				s+=Character.toUpperCase(ch);
			else
				s+=Character.toLowerCase(ch);
		}
		System.out.println(s);
		
		return s;
	}
	
	//Check if the given string is Palindrome or not 
	public static boolean isPalindrome(String s) {
		boolean result = new StringBuffer(s).reverse().toString().toLowerCase().equals(s.toLowerCase());
		System.out.println(result);
		return result;
	}
	
	//Remove all characters from string except alphabets
	public static String removeChar(String str) {
		String s="";
		
		for(char ch : str.toCharArray()) {
			if(Character.isAlphabetic(ch))
				s+=ch;
		}
		System.out.println(s);
		return s;
	}
	
	//Remove spaces from a string 
	public static String removeSpace(String str) {
		String s = "";

		for (char ch : str.toCharArray()) {
			if (!Character.isWhitespace(ch))
				s += ch;
		}
		System.out.println(s);
		return s;
	}
	
	//Java program to remove brackets from an algebraic expression
	public static String removeBracket(String str) {
		String s = str.replaceAll("[{()}]","");
		System.out.println(s);
		return s;
	}
	
	//Count the sum of numbers in a string 
	public static int sumOfNums(String str) {
		int sum=0;
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) {
				sum+=Integer.parseInt(""+ch);
			}
		}
		System.out.println(sum);
		return sum;
	}
	
	//Capitalize the first and last character of each word of a string 
	public static String capitalizeString(String str) {
		if(str.length()==1)
			return str;
		String rest = str.substring(1,str.length()-1);
		
		String first = Character.toUpperCase(str.charAt(0))+"";
		//System.out.println(first);
		
		String last = Character.toUpperCase(str.charAt(str.length()-1))+"";
		//System.out.println(last);
		
		String newString = first+rest+last;
		System.out.println(newString);
		
		return newString;
	}
	
	public static void charFrequency(String str) {
		int arr[] = new int[256];
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println((char)i+"-->"+arr[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		//isCharacter('1');
		//getLength("string");
		//toggleString("StrufbJFJ");
		//isPalindrome("AMaa");
		//removeChar("12ndfbhs3");
		//removeSpace("sdhf fhf h");
		//removeBracket("(a+b)");
		//sumOfNums("123");
		//capitalizeString("sbdhff");
		charFrequency("stareeeasdrr1231188");
	}
}
