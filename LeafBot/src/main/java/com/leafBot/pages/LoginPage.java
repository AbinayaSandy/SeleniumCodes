package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage()
	{
		
	}

	public LoginPage enterUserName(String data)
	{
		WebElement eleusername = locateElement("id","username");
		eleusername.sendKeys(data);
		
		return this;
	}
	public LoginPage enterPassword(String data)
	{
		WebElement elepwd = locateElement("id","password");
		elepwd.sendKeys(data);
		return this;
	}
	
	public HomePage clickLogin()
	{
		WebElement eleclick = locateElement("class","decorativeSubmit");
		eleclick.click();
		
		return new HomePage();
	}
}
