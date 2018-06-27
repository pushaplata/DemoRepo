package DDFramwork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class TestCase001 extends BaseClass {
	//@Test(dataProvider="dp_data")
	@Test(dataProvider="test1")
	public void TC_001(Object a,Object b) {
		TestPage t1= new TestPage(driver);
		//t1.ClickRegistrationButton();
		t1.EnterData(a.toString(),b.toString());
		
		
	}
	/*@DataProvider(name= "dp_data")
	public Iterator <Object[]> TestData1() throws IOException{
		ArrayList<Object[]> testdata2= TestData.getDataFromExcle();
		 return testdata2.iterator();
		
		}*/
	@DataProvider(name="test1")
	public Object[][] testdata21(){
	 Object[][] arr= {
			{"username1","password1"},
			{"username2","password2"}
	};
		return arr;
	}
}


