package com.demo.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class BookStore {
	@Test
	public void store() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\Practice_Java_Programms\\lib\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.get("https:\\fb.com");
		String title= obj.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Facebook");

		
		
		
	}
	  

}
