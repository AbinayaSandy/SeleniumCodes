package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{

	public MyLeadsPage()
	{
		
	}
	public CreateLeadPage clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
}
