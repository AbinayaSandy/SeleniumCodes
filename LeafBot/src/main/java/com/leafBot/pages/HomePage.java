package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class HomePage extends ProjectSpecificMethods {
	
	public HomePage()
	{
		
	}
	/*public void clickLogout()
	{
		WebElement eleLogout = locateElement("id","logout");
		eleLogout.click();
		System.out.println("logout");
	}*/
	public MyHomePage clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
}
