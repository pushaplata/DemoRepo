package com.collections.test;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		
		//it is similar to the hasMap, but it is syncronized
		//store the value on basic f key and value pair
		//Key--> object--> hashcode--> Value
		
		Hashtable  h1= new Hashtable();
		h1.put(1,"tom");
		h1.put(2,"jim");
		h1.put(3,"jhone");
		
		//Create clone copy
		Hashtable  h= new Hashtable();
		h=(Hashtable) h1.clone();
		
		System.out.println(h1);
		System.out.println(h);
		
		h1.clear();
		
		System.out.println(h1);
		System.out.println(h);
		
		Hashtable  h2= new Hashtable();
		h2.put(1,"tom");
		h2.put(2,"jim");
		h2.put(3,"jhone");
		
		//contains Value
		if(h2.containsValue("jim2"));
		System.out.println(true);
		
		//print all the value of hashtable on the basic of enumeration- elements()
		Enumeration em=h2.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
			
		//get the value from hashtable using entrySet
		System.out.println("************");	
		Set s=h2.entrySet();
		System.out.println(s);
		
		Hashtable  h3= new Hashtable();
		h3.put(1,"tom");
		h3.put(2,"jim");
		h3.put(3,"jhone");
		//h3.put(NULL,"jhone");//no null value and key allow,it contain only uniqe value
		
		//Check both the HashTable are equal or not
			if(h2.equals(h3)) {
				System.out.println("all are equal");
				
			}
			
			//get the value from key:
			System.out.println(h3.get(2));
			
			//get the hashcode of hashtable object
			
			System.out.println(h3.hashCode());
			
		}
		

	
	}
}
