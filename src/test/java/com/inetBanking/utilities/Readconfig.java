package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	public Readconfig()
	{
		File src=new File("C:\\Users\\User\\eclipse-workspace\\inetBanking\\Configuration\\config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is: "+e.getMessage());
		}
	}
	public String getApplicationurl() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUsername() {
		String username=pro.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}
	public String getChromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getMozillapath() {
		String geckopath=pro.getProperty("geckopath");
		return geckopath;
	}
	public String getEdgepath() {
		String edgepath=pro.getProperty("edgepath");
		return edgepath;
	}
}
