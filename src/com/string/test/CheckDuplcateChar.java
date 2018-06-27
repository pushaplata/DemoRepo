package com.string.test;

public class CheckDuplcateChar {

	public static void main(String[] args) {
		
		String str= "avatarv";
		int cnt=0;
		char[] inp= str.toCharArray();
		System.out.println("Duplicat characyer in string");
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				
				if(inp[i]==inp[j]) {
					System.out.println(inp[j]);
					cnt++;
					break;
				}
				
			}
		}

	}

}
