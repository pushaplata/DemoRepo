package com.string.test;

public class CompareTwoString {

	public static void main(String[] args) {
		String s="AVATAR";
		String s1= "avatar";
		
		if(s.equals(s1)) {
			System.out.println("string is equal");
		}
		else if(s.equalsIgnoreCase(s1)) {
			System.out.println("string is equals without case");
		}
			

	}

}
