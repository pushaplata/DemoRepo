package com.collections.test;

import java.util.ArrayList;
import java.util.Iterator;

public class StoreEmployeeClassObjectInArrayList {

	public static void main(String[] args) {
		
		Employee emp1= new Employee("sweety",10,"QA");
		Employee emp2= new Employee("preeti",20,"dev");
		Employee emp3= new Employee("deepak",30,"UAT");
		
		ArrayList<Employee> arr= new ArrayList<Employee>();
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);
		
		Iterator<Employee> itr= arr.iterator();
		while(itr.hasNext()) {
			Employee empList= itr.next();
			System.out.println(empList.name);
			System.out.println(empList.age);
			System.out.println(empList.dept);
			
		}
	
		//***********************************
		
		//addAll();
		
		ArrayList<String> arrList= new ArrayList<String>();
		arrList.add("qa1");
		arrList.add("qa2");
		arrList.add("qa3");
		//System.out.println(arrList);
		
		ArrayList<String> arrList1= new ArrayList<String>();
		arrList1.add("qa111");
		arrList1.add("qa222");
		arrList1.add("qa333");
		
		arrList.addAll(arrList1);
		
		//for(int i=0; i<arrList.size(); i++) {
		for(String j:arrList) {
			System.out.println(j);
			
		}
		System.out.println("*********************");
		
	    arrList.removeAll(arrList1);
	    for(String j:arrList) {
			System.out.println(j);
		}
		System.out.println("*********************");
		
		ArrayList<String> arrList3= new ArrayList<String>();
		arrList3.add("qa1");
		arrList3.add("qa2");
		arrList3.add("qa3");
		//System.out.println(arrList);
		
		ArrayList<String> arrList4= new ArrayList<String>();
		arrList4.add("qa111");
		arrList4.add("qa2");
		arrList4.add("qa333");
		
		arrList3.retainAll(arrList4);
		
		 for(String j:arrList3) {
			System.out.println(j);
		
		}
		 System.out.println("%%%%%%%%%%%%%%%%%%");
		 int num=0;
			while(arrList3.size()>num) {
				System.out.println(arrList3.get(num));
				num++; 
			}
	}

}
