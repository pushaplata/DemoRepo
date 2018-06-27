package com.excel.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelOperations {

	public static void main(String[] args) {
		
		Xls_Reader reader= new Xls_Reader("G:\\SweetyWP\\AutomationTesting\\src\\com\\testData\\testdata.xlsx");
		//reader.addSheet("HomePage");
		
		
		int s=reader.getColumnCount("RegPage");
		System.out.println(s);
		System.out.println(reader.getCellRowNum("RegPage", "Name", "aavya"));
		
		}
	}

