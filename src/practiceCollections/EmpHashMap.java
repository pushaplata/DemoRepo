package practiceCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class EmpHashMap {

	public static void main(String[] args) {
		
		HashMap <Integer, javaEmpTest> map = new HashMap<Integer, javaEmpTest>();
		
		javaEmpTest emp = new javaEmpTest("sweety", 12);
		javaEmpTest emp1 = new javaEmpTest("pankah", 15);
		javaEmpTest emp2 = new javaEmpTest("preeti", 16);
		
		map.put(1, emp);
		map.put(2, emp2);
		//map.put(3, emp3);
		
		for(Entry<Integer,javaEmpTest> m: map.entrySet()) {
			int key1 = m.getKey();
			javaEmpTest t1 = m.getValue();
			
		}
		HashMap <Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1,"A" );
		map1.put(2, "B");
		map1.put(3, "C");
		Iterator itr=map1.keySet().iterator();
		while(itr.hasNext()) {
			String e1 =(String) itr.next();
			System.out.println(map1.get(e1));
		}
		
		

	}

}
