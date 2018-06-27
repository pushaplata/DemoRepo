package com.string.test;

public class CheckPalandrom {

	public static void main(String[] args) {
		String s="radar";
		String s1="";
		
		for(int i=s.length()-1;i>0;i--) {
			
			 s1=s1+s.charAt(i);
			
		}
		if(s.equals(s1)) {
		
		}
		

	}

}
