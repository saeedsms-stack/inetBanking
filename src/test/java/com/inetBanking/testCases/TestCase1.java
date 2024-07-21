package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPageObject;
import com.sun.tools.sjavac.Log;

import junit.framework.Assert;

public class TestCase1 extends BaseClass {
	@Test
	public void loginTest() {
		driver.get(baseURL);
		LoginPageObject lp=new LoginPageObject(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			Log.info("The test case passed");
		}
		else
		{
			Assert.assertFalse(false);
			Log.info("The test case failed");
		}
		}

}
