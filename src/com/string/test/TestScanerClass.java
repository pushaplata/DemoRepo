package com.string.test;

import java.util.Scanner;

public class TestScanerClass {
	
	static int a,b;
	static int c=a+b;
	

	public static void main(String[] args) {
		 Scanner scn= new Scanner(System.in);
		 System.out.println("Enter the value:");
		 a= scn.nextInt();
		 System.out.println("value"  +a);
		 System.out.println("Enter the value:");
		 b= scn.nextInt();
		 System.out.println(" value"  +b);
         System.out.println(" value of "  +c);
		 

	}

}
