package DDFramwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestData {
	//@DataProvider(name="readdata_excle")
	public static ArrayList <Object[]> getDataFromExcle() throws IOException {
		ArrayList <Object[]> mydata= new ArrayList<Object[]>(); 
	
		File f= new File("G:\\SweetyWP\\testdata.xlsx");
		FileInputStream fs= new FileInputStream(f);
		XSSFWorkbook wk= new XSSFWorkbook(fs);
		XSSFSheet s1= wk.getSheet("Sheet1");
		 int r= s1.getPhysicalNumberOfRows();
		//Object[][] arr= new Object[r][2];
		for(int i=2;i<=r;i++) {
			XSSFRow r1=s1.getRow(i);
			XSSFCell Name=r1.getCell(0);
			XSSFCell Username=r1.getCell(1);
			XSSFCell Password=r1.getCell(2);   
			XSSFCell ConfirmPassword=r1.getCell(3);
			XSSFCell EmailAddress=r1.getCell(4);
			XSSFCell ConfirmEmailAddress=r1.getCell(5);
			
			Object arr[]= {Name,Username,Password,ConfirmPassword,EmailAddress,ConfirmEmailAddress};
			mydata.add(arr);
			
			
			
			//XSSFRow r1= s1.getRow(i);
			//XSSFCell cu= r1.getCell(0);
			//XSSFCell cl= r1.getCell(1);
			
			//Object[][] arr= new Object[r][2];
			//arr[i][0]= cu.getStringCellValue();
			//arr[i][1]= cl.getStringCellValue();
			
			
			
		 
		
	}
		return mydata;
	
	}
	
 

}
