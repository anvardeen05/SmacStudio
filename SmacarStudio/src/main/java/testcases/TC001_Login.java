package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.SmacarStudioWrappers;

public class TC001_Login extends SmacarStudioWrappers{

	@BeforeClass(groups="smoke")
	public void setValues() {
		browserName="Chrome";
		testCaseName="TC001 - Login";
		testDescription="Login and Logout from Smacar Studio (Positive)";
		category="Smoke";
		dataSheetName="TC001";
	}
	
	
	@Test(dataProvider="fetchData",groups="smoke")
	public void loginSmacarStudio(String userName, String password) {

		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickUserDropDown()
		.clickSignOut();
		
	}	
}










