package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.SmacarStudioWrappers;

public class TC004_UploadMarker extends SmacarStudioWrappers{

	@BeforeClass(groups="smoke")
	public void setValues() {
		browserName="Chrome";
		testCaseName="TC004 - Upload Marker to the Campaign";
		testDescription="Upload Marker to the Campaign in Smacar Studio (Positive)";
		category="Smoke";
		dataSheetName="TC004";
	}

	@Test(dataProvider="fetchData",groups="smoke")
	public void uploadMarker(String userName, String password, String filePath, String message) throws InterruptedException {

		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCampaign()
		.clickNewMarker()
		.clickAddNewMarker()		
		.selectMarker(filePath)
		.clickUploadButton()
		.verifySuccessMessage(message)
		.clickSuccessOk()		
		.clickUserDropDown()
		.clickSignOut();	
	}
}










