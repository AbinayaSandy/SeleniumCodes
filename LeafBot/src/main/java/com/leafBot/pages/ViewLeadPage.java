package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage()
	{
		
	}
	public void verifyFirstName()
	{
		String nameDisplay = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("TestCase Completed");
		
	}
	
}
