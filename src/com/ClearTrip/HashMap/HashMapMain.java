package com.ClearTrip.HashMap;

import java.util.HashMap;

public class HashMapMain {
	
	public static HashMap<String, String> ClearTripCredential() 
	{
		HashMap<String,String> map= new HashMap<String, String>();
		map.put("customer","sweetythakur208@gmail.com_Aavya@1234");
		map.put("admin","pankaj_pass@12345");
		
		return map;
		
	}
	
   public static HashMap<Integer,String> DataPicker() 
   {
      HashMap<Integer,String> map1= new HashMap<Integer,String>();
      map1.put(1,"January");
      map1.put(2,"February");
      map1.put(3,"March");
      map1.put(4,"April");
      map1.put(5,"May");
      map1.put(6,"June");
      map1.put(7,"July");
      map1.put(8,"August");
      map1.put(9,"September");
      map1.put(10,"October");
      map1.put(11,"November");
      map1.put(12,"December");
      
      return map1;
   }
}
