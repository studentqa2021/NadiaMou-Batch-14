package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory1 {

	public PageFactory1 (WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[contains(text(),'Sign in')]")//signin
	private WebElement signIn;

	
	@FindBy(xpath="(//*[contains(@id,'email')])[2]")//email
	private WebElement email;
	
	
	@FindBy(xpath="//*[contains(@name,'passwd')]")//password
	private WebElement passwd;
	
	
	@FindBy(xpath="//*[contains(@id,'SubmitLogin')]")//password
	private WebElement submitbuton;

	

	public WebElement getSignIn() {
		return signIn;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPasswd() {
		return passwd;
	}


	public WebElement getSubmitbuton() {
		return submitbuton;
	}
	
	
}
