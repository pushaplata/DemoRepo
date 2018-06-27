package com.collections.test;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet();
		hs.add("qa");
		hs.add("qa1");
		hs.add("qa1");
		Iterator <String> itr = hs.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
