package com.corejava.test;


class TestData{
	int id;
	String name;
	
	void inserRecord(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	void display() {
		System.out.println(id+"  "+name);
	}
	
}

public class WayOFfCreateObject {

	public static void main(String[] args) {
		
		TestData td= new TestData();
		td.inserRecord(10, "sweety");
		td.display();
		

	}
	

}
