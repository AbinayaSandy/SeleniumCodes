package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class TC_001_CreateLead extends ProjectSpecificMethods {
	//LeafTap Lead Creation
	
	@BeforeTest
	public void setData()
	{   
		testcaseName="TC_001_CreateLead";
		testcaseDec="Test the create lead functionality";
		author="Abi";
		category="Smoke";
		excelFileName="TC001";
	}
	
	@Test(dataProvider ="fetchData")
		public void runLogin(String UserName,String Password,String CName,String FName,String LName)
		{
			new LoginPage().enterUserName(UserName).enterPassword(Password).clickLogin().clickCRMSFA().clickLeads().clickCreateLead()
			.enterCompanyName(CName).enterFirstName(FName).enterLastName(LName).submitCreateLead().verifyFirstName();
		}
		
	
	
	
}
