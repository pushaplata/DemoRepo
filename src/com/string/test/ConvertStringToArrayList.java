package com.string.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringToArrayList {

	public static void main(String[] args) {
		
		String s = "12,45,75,84,58,78";
		String s1[]  = s.split(",");
		
		for(String m: s1) {
		System.out.println(m);
		}
		

	}

}
