package com.corejava.test;

public class TestStaticKeyWord {
	static String companyName="IBM";
	int empid;
	String empName;
	int empAge;
	
	TestStaticKeyWord(int empid,String empName,int empAge){
		this.empid= empid;
		this.empName=empName;
		this.empAge=empAge;
		
		}
	void Dislay() {
		System.out.println(empid+"  "+empAge+"  "+empName+"  "+companyName);
	}
	

	public static void main(String[] args) {
		
		TestStaticKeyWord tw= new TestStaticKeyWord(14,"pankaj",35);
		tw.Dislay();
		TestStaticKeyWord tw1= new TestStaticKeyWord(19,"paio",32);
		tw1.Dislay();
		TestStaticKeyWord tw2= new TestStaticKeyWord(191,"pankaj12",36);
		tw2.Dislay();
		
	}

}
