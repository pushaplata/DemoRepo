package practiceCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEMP {

	public static void main(String[] args) {
		
		javaEmpTest emp = new javaEmpTest("sweety", 12);
		
		ArrayList<javaEmpTest> list = new ArrayList<javaEmpTest>();
		
		list.add(emp);
		Iterator<javaEmpTest> itr = list.iterator();
		while(itr.hasNext()) {
			javaEmpTest e1 = itr.next();
					System.out.println(e1.name);
					System.out.println(e1.age);
			
		}
		
		
		ArrayList<String> arrList= new ArrayList<String>();
		arrList.add("qa1");
		
		ArrayList<String> arrList1= new ArrayList<String>();
		arrList1.add("qa1=2");
		
		arrList.addAll(arrList1);
		
		for(String j: arrList)
		{
			System.out.println(j);
		}

		arrList.removeAll(arrList);
		for(String j: arrList)
		{
			System.out.println(j);
		}
		
		
		
		
	}
	
}
