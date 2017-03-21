package com.codebind;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","/Users/kanchan.sharma/Downloads/chromedriver");
		
	    ChromeDriver driver = new  ChromeDriver();
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("Kanchan Sharma"); 
	    element.submit();

	}

}
