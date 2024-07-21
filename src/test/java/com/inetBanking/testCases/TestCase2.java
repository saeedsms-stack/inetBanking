package com.inetBanking.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 extends BaseClass{
	
	@Test(DataProvider="LoginData")
	public void LoginDDT()
	{
		
	}
	@DataProvider(name="LoginData")
	 void getData(){
		String path=System.getProperty("C:\\Users\\User\\eclipse-workspace\\inetBanking\\src\\test\\java\\com\\inetBanking\\testData\\TestData.xlsx");
	}

}
