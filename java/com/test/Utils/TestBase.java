package com.test.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties pro;
	
public TestBase() {
	
	try {
		FileInputStream	fls = new FileInputStream(System.getProperty("usir.dir") + "\\src\\test\\java\\com\\test\\Config\\config.Properties");
		pro = new Properties();
		pro.load(fls);
	} catch (FileNotFoundException e) {
		System.out.println(" File not found ");
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public void Initializetion() {
		String BrowserName = pro.getProperty("Browser");
		if(BrowserName.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("usir.dir")+ "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		}else
			System.out.println(" Browser not found.");		
	}
	public static void getURL(String URL) { 
		driver.get(pro.getProperty("url"));
	}
}


	
	
	
	
	
	

