package com.corejava.test;

public class TestStaticMethod {
	
	
	
	int id;
	static String name="sweety";
	int age;
	
	
     TestStaticMethod(){
		
		System.out.println("sweety24255");
	}
     
	TestStaticMethod(int id, int age){
		this();
		this.id=id;
		this.age=age;
		
		}
	
	
	static void change() {
		name="pankaj";
		
	}
	
	void display1() {
		
		System.out.println("qa23");
		
	}
	void display() {
		this.display1();
		System.out.println(id+" "+age+" "+name);
		
	}
	
	public static void main(String[] args) {
		
		TestStaticMethod.change();
		TestStaticMethod td= new TestStaticMethod(12,54);
		td.display();
		td.display1();
	
		
	

	}

}
