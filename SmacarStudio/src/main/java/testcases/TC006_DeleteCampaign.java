package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.SmacarStudioWrappers;

public class TC006_DeleteCampaign extends SmacarStudioWrappers{

	@BeforeClass(groups="smoke")
	public void setValues() {
		browserName="Chrome";
		testCaseName="TC006 - Delete Campaign";
		testDescription="Delete Campaign in Smacar Studio (Positive)";
		category="Smoke";
		dataSheetName="TC006";
	}

	@Test(dataProvider="fetchData",groups="smoke")
	public void deleteCampaign(String userName, String password, String publishtitle) throws InterruptedException {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickDeleteCampaignButton()
		.clickDeleteOk()
		.clickUserDropDown()
		.clickSignOut();
		

	}

}










