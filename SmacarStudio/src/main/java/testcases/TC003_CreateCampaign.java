package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.SmacarStudioWrappers;

public class TC003_CreateCampaign extends SmacarStudioWrappers{

	@BeforeClass(groups="smoke")
	public void setValues() {
		browserName="Chrome";
		testCaseName="TC003 - Create Campaign";
		testDescription="Create Campaign in Smacar Studio (Positive)";
		category="Smoke";
		dataSheetName="TC003";
	}

	@Test(dataProvider="fetchData",groups="smoke")
	public void createNewCampaign(String userName, String password, String campaignName) {

		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickNewCampaign()
		.enterCampaignName(campaignName)
		.clickCampaignType()
		.selectCampaignType()
		.clickCreateButton()
		.verifyCreatedCampaign(campaignName)
		.clickUserDropDown()
		.clickSignOut();		

	}

}










