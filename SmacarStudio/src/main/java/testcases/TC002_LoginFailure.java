package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.SmacarStudioWrappers;

public class TC002_LoginFailure extends SmacarStudioWrappers{

	@BeforeClass(groups="regression")
	public void setValues() {
		browserName="Chrome";
		testCaseName="TC002 - Login Failure";
		testDescription="Login to Smacar Studio (Negative)";
		category="Regression";
		dataSheetName="TC002";
	}

	@Test(dataProvider="fetchData",groups="regression")
	public void loginSmacarStudio(String userName, String password, String error) {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginForFailure()
		.verifyErrorMessage(error);

	}

}










