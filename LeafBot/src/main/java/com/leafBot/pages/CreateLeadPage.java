package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{

	public CreateLeadPage()
	{
		
	}
	public CreateLeadPage enterCompanyName(String data)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String data)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;
	}
	public CreateLeadPage enterLastName(String data)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
		return this;
	}
	public ViewLeadPage submitCreateLead()
	{
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage();
	}
	
}
