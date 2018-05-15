package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.SmacarStudioWrappers;

public class LoginPage extends SmacarStudioWrappers {
	
	public LoginPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Smacar Studio"))
			reportStep("This is not Login Page", "FAIL");

	}

	public LoginPage enterUserName(String data) {
		enterByName(prop.getProperty("Login.UserName.Name"), data);
		return this;

	}
	
	public LoginPage enterPassword(String data) {
		enterByName(prop.getProperty("Login.Password.Name"), data);
		return this;
	}
	
	public HomePage clickLogin() {
		clickByXpath(prop.getProperty("Login.LoginButton.Xpath"));
		return new HomePage(driver,test);		
	}
	
	public LoginPage clickLoginForFailure() {
		clickByXpath(prop.getProperty("Login.LoginButton.Xpath"));
		return this;
		
	}
	public LoginPage verifyErrorMessage(String data) {		
		verifyTextByXpath(prop.getProperty("Login.Error.Xpath"), data);		
		return this;		
	}

}
