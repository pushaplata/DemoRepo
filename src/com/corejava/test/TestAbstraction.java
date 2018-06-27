package com.corejava.test;

import org.apache.poi.util.SystemOutLogger;

interface printable {
	void sum();
	void sub();
	
}
interface clickable {

	
  void sum1();

	
  void sub2();
	
}



 public class TestAbstraction implements printable,clickable  {
	 
	 @Override
		public void sum1() {
			System.out.println("aavya452");
			
		}

		@Override
		public void sub2() {
			System.out.println("aavya453");
			
		}
	 

		@Override
		public void sum() {
			System.out.println("aavya23");
			
			
		}

		@Override
		public void sub() {
			System.out.println("aavya45");
			
			
		}
	 
	 
	public static void main(String[] args) {
		TestAbstraction ts= new TestAbstraction();
		ts.sub();
		ts.sum1();
		ts.sub2();
		ts.sub2();
		ts.sub2();
		

	}

	


}
