package com.collections.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkList {

	public static void main(String[] args) {
		
		
		LinkedList<String> lt = new LinkedList<String>();
		
		
		lt.add("sweety1");
		lt.add("sweety2");
		lt.add("sweety3");
		lt.add("sweety4");
		System.out.println(lt);
		
		lt.addFirst("preeti");
		lt.addLast("deepak");
		System.out.println(lt);
		System.out.println(lt.get(2));
		
		lt.set(4, "aavya");
		System.out.println(lt);
		
		lt.removeFirst();
		lt.removeLast();
		System.out.println(lt);
		
		lt.remove(3);
		System.out.println(lt);
		
		//Iterate
		//for loop
		//for each
		//while loop
		
		
		//for loop
		for(int n=0;n<lt.size();n++) {
		System.out.println(lt.get(n));	
			
		}
		//for each
		System.out.println("%%%%%%%%%%%%%%%%%%");
		for(String s: lt) {
			System.out.println(s);
			}
		//Iterate
		System.out.println("%%%%%%%%%%%%%%%%%%");
		Iterator<String> itr= lt.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//while loop
		System.out.println("%%%%%%%%%%%%%%%%%%");
		int num=0;
		while(lt.size()>num) {
			System.out.println(lt.get(num));
			num++;
		}
		
				
		
		
		
		
		
		
		
		
		
		
		//Using Iterator****************
		/*Iterator <String> itr = lt.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
       // Using for loop*****************
        for(int i=0;i<lt.size();i++) {
        	System.out.println(lt.get(i));
        }
        
        //Using for each********************
        for(String s1:lt) {
        	System.out.println(s1);
        }*/
        
	}

}
