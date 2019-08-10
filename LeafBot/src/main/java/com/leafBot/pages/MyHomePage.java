package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

	public MyHomePage()
	{
		
	}
	public MyLeadsPage clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}
}
