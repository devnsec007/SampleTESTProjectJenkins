package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestngTestpkg {

	
	@Test
	
	public void Test001() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir").toString()+"\\Resources\\chromedriver.exe");
		
		ChromeOptions CO = new ChromeOptions();
		//This is the recent hack for ChromeDriver issue with the latest Selenium
		//CO.addArguments("--remote-allow-origins*");
		WebDriver driver = new ChromeDriver();
	  	
	  	driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	  	driver.get("https://www.google.com");
	  	System.out.println("The tile of the browser is : : "+driver.getTitle());
		
	}
	
}
