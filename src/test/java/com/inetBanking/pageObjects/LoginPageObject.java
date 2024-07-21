package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	private WebDriver driver;
	
	public LoginPageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(name="uid")
	WebElement Txtusername;
	
	@FindBy(name="password")
	WebElement Txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	public void setUserName(String uname)
	{
		Txtusername.sendKeys(uname);
	}
	public void setPassword(String Password)
	{
		Txtpassword.sendKeys(Password);
	}
	public void clickSubmit()
	{
		btnlogin.click();
	}
}
