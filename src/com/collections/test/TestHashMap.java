package com.collections.test;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.TestXpaths.TestFunctiosInXpath;

public class TestHashMap {

	public static void main(String[] args) {
		Logger log= Logger.getLogger(TestHashMap.class);
		//HasMap implements Map Interface
	   //
	   //Logger log = Logger.getLogger(TestFunctiosInXpath.class);
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "testing");
		map.put(2, "Selenium");
		map.put(3, "QTP");
		map.put(4, "API");
		map.put(5, "Java");
		System.out.println(map.get(5));
		
		for(Entry m: map.entrySet()) {
			
			System.out.println(m.getKey()+"  "+m.getValue());
			
		}
		map.remove(5);
		System.out.println(map);
//--------------------------------------------------------------------------
		
		Employee e1= new Employee("sweety1",45,"IT");
		Employee e2= new Employee("sweety2",55,"HR");
		Employee e3= new Employee("sweety3",66,"Admin");
		
		
		HashMap<Integer,Employee> emp= new HashMap<Integer,Employee>();
			
			emp.put(1, e1);
			emp.put(2, e2);
			emp.put(3, e3);
			for(Entry<Integer,Employee> m: emp.entrySet()) {
				int key= m.getKey();
				Employee emp1=m.getValue();
				System.out.println(emp1.name+" "+emp1.age+" "+emp1.dept);
				log.info("this is information");
			}
			
		}

	
}

