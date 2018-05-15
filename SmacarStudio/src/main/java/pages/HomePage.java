package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.SmacarStudioWrappers;

public class HomePage extends SmacarStudioWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Smacar Studio - Campaign Dashboard"))
			reportStep("This is not Home Page of Smacar Studio", "FAIL");

	}

	public HomePage clickNewCampaign(){
		clickByXpath(prop.getProperty("Home.NewCampaign.Xpath"));
		return this;
	}

	public HomePage enterCampaignName(String data){
		enterByXpath(prop.getProperty("Home.CampaignName.Xpath"), data);
		return this;
	}

	public HomePage clickCampaignType(){
		clickByXpath(prop.getProperty("Home.CampaignTypeClick.Xpath"));
		return this;
	}

	public HomePage selectCampaignType(){
		clickByXpath(prop.getProperty("Home.CampaignTypeVal.Xpath"));
		return this;
	}

	public HomePage clickCreateButton(){
		clickByXpath(prop.getProperty("Home.Create.Xpath"));
		return this;
	}

	public HomePage verifyCreatedCampaign(String data) {		
		verifyTextByXpath(prop.getProperty("Home.CreatedCampaign.Xpath"), data);		
		return this;		
	}

	public HomePage clickCampaign(){
		clickByXpath(prop.getProperty("Home.ClickCampaign.Xpath"));
		return this;		
	}

	public HomePage clickNewMarker(){
		clickByXpath(prop.getProperty("Home.NewMarker.Xpath"));
		return this;		
	}

	public HomePage clickAddNewMarker(){
		clickByXpath(prop.getProperty("Home.AddNewMarker.Xpath"));		
		return this;		
	}

	public HomePage selectMarker(String data){
		fetchFiletoUpload(data);
		return this;		
	}

	public HomePage clickUploadButton(){
		clickByXpath(prop.getProperty("Home.ClickUploadButton.Xpath"));
		return this;		
	}

	public HomePage clickSuccessOk(){
		clickByXpath(prop.getProperty("Home.ClickSuccessOk.Xpath"));
		return this;		
	}

	public HomePage verifySuccessMessage(String data) {		
		verifyTextByXpath(prop.getProperty("Home.SuccessMessage.Xpath"), data);		
		return this;		
	}

	public HomePage clickEditMarker() {		
		clickByXpath(prop.getProperty("Home.MarkerEdit.Xpath"));		
		return this;		
	}	

	public HomePage clickPublishButton() throws InterruptedException {		
		clickByXpath(prop.getProperty("Home.PublishMarker.Xpath"));	
		Thread.sleep(10000);
		return this;		
	}	

	public HomePage verifyPublishTitle(String data) {
		if (!verifyTitle(data)){
			reportStep("This is not Publised Marker in Smacar Studio", "FAIL");
		}
		return this;
	}

	public HomePage clickDeleteCampaignButton() {		
		clickByXpath(prop.getProperty("Home.DeleteCampaign.Xpath"));		
		return this;		
	}

	public HomePage clickDeleteOk() {		
		clickByXpath(prop.getProperty("Home.DeleteOk.Xpath"));		
		return this;		
	}

	public HomePage clickUserDropDown() {
		clickByXpath(prop.getProperty("Home.UserDropDown.Xpath"));
		return this;
	}

	public LoginPage clickSignOut() {		
		clickByXpath(prop.getProperty("Home.SignOut.Xpath"));
		return new LoginPage(driver, test);
	}

}





