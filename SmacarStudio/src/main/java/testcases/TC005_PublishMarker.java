package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.SmacarStudioWrappers;

public class TC005_PublishMarker extends SmacarStudioWrappers{

	@BeforeClass(groups="smoke")
	public void setValues() {
		browserName="Chrome";
		testCaseName="TC005 - Publish Marker to the Campaign";
		testDescription="Publish Marker to the Campaign in Smacar Studio (Positive)";
		category="Smoke";
		dataSheetName="TC005";
	}

	@Test(dataProvider="fetchData",groups="smoke")
	public void publishMarker(String userName, String password, String publishtitle) throws InterruptedException {

		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCampaign()
		.clickEditMarker()
		.clickPublishButton()
		.verifyPublishTitle(publishtitle)
		.clickUserDropDown()
		.clickSignOut();		

	}

}










