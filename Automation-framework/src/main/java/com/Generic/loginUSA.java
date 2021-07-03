package com.Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginUSA implements BaseLogin{

	@Override
	public void fblogin() {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("bangladesh@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
	driver.quit();
		
		
		
	}
	
	
	
}



		
		
		
		
		
		
		
		
	

	
	
		
	
	
	
	
	
	




