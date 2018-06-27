package com.TestDataProviser;

import java.util.ArrayList;



import com.excel.utility.Xls_Reader;

public class ExcelUtil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){           	

      ArrayList<Object[]> mydata= new ArrayList<Object[]>();
	
	reader= new Xls_Reader("G:\\SweetyWP\\AutomationTesting\\src\\com\\testData\\testdata.xlsx");
	
	for(int rowNum=2; rowNum<=reader.getRowCount("RegPage"); rowNum++) {
		
		String Name= reader.getCellData("RegPage", 0,rowNum );
	     System.out.println(Name);
	     
	     String Username= reader.getCellData("RegPage", 1, rowNum);
	     System.out.println(Username);
	     
	     String Password= reader.getCellData("RegPage", 2, rowNum);
	     System.out.println(Password);
	     
	     String ConfirmPassword= reader.getCellData("RegPage", 3, rowNum);
	     System.out.println(ConfirmPassword);
	     
	     String EmailAddress= reader.getCellData("RegPage", 4, rowNum);
	     System.out.println(EmailAddress);
	     
	     
	     Object obj[]= {Name,Username,Password,ConfirmPassword,EmailAddress};
	     
	     mydata.add(obj);
	     
		
	}
	return mydata;
}
}
	 



