package com.corejava.test;


public class CreateObjectThroughCunstructor {
	
	int id;
	String name;
	int age;
	
	CreateObjectThroughCunstructor(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	    void display() {
		System.out.println(id+" "+name);
		
	}
	
	

	public static void main(String[] args) {
		
		CreateObjectThroughCunstructor ya= new CreateObjectThroughCunstructor(12,"preety");
		ya.display();
			    

				
	}

}
