package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BaseConfig;

public class PageFactoryPractice {
	
public static void pagefactoryCoding () {
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to(BaseConfig.getConfigValue("URL"));
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	PageFactory1 obj = new PageFactory1(driver);
	obj.getSignIn().click();
	obj.getEmail().sendKeys(BaseConfig.getConfigValue("user"));
	obj.getPasswd().sendKeys(BaseConfig.getConfigValue("password"));
	obj.getSubmitbuton().click();
	
	
			
	}
}
