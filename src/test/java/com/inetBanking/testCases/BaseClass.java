package com.inetBanking.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.inetBanking.utilities.Readconfig;

public class BaseClass {
	Readconfig readconfig=new Readconfig();
	public String baseURL=readconfig.getApplicationurl();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	@Parameters("Browser")
	@BeforeClass
	public void Setup(String br)
	{
		Logger logger = LogManager.getLogger("inetBanking");
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
			driver=new ChromeDriver();
		}
		else if(br.equals("Mozilla"))
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getMozillapath());
			driver=new FirefoxDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", readconfig.getEdgepath());
			driver=new EdgeDriver();
		}
		
	}
	
	
	
	private void elseif(boolean equals) {
		// TODO Auto-generated method stub
		
	}



	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
