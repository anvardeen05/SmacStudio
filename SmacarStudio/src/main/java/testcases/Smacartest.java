package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Smacartest {
	public RemoteWebDriver driver;
	@Test(enabled=false)
	public void firefox()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.smacar.com/studio/");
	}
	@Test
	public void ie()
	{
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.smacar.com/studio/");
	}
	@Test(enabled=false)
	public void test(){
		//System.out.println(System.getProperty("user.dir"));	
		
		String filePath = System.getProperty("user.dir") + "\\data\\Baahubali2.jpg";
		System.out.println(filePath);
	}
	@Test(enabled=false)
	public void smarcartest() throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver, 120);
		driver.get("https://qa.smacar.com/studio/");
		/*driver.findElement(By.name("lmail")).clear();
		driver.findElement(By.name("lmail")).sendKeys("anvar05@gmail.com");
		driver.findElement(By.name("lpwd")).clear();
		driver.findElement(By.name("lpwd")).sendKeys("Anvardeen@123");
		driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();*/
		/*String sText = driver.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div/form/p").getText();
		System.out.println(sText);*/
		/*WebDriverWait wait =new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'NEW CAMPAIGN')]")));
		driver.findElement(By.xpath("//div[contains(text(),'NEW CAMPAIGN')]")).click();
		driver.findElement(By.xpath("//div/input[@id='pjtName']")).clear();
		//enter campaign
		driver.findElement(By.xpath("//div/input[@id='pjtName']")).sendKeys("Campaign01");	
		//click type
		driver.findElement(By.xpath("//div/input[@class='select-dropdown']")).click();		
		//select type
		driver.findElement(By.xpath("//span[text()='Magazine']")).click();
		//
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/a[1]")).click();
		*/
		//driver.findElement(By.xpath("//p[text()='Campaign01']")).click();
		
		/*driver.findElement(By.xpath("//div[contains(text(),'NEW MARKER')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Drop files here or click to upload')]")).click();
		
		Thread.sleep(4000);
		
	

		// Store the copied text in the clipboard
		StringSelection stringSelection = new StringSelection("E:\\Smacar_Projects\\SmacarApp\\Test Data\\Markers\\Wangs2.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		// Paste it using Robot class
		Robot robot = new Robot();

		// Enter to confirm it is uploaded
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		

		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'UPLOAD')]")));

		driver.findElement(By.xpath("//button[contains(text(),'UPLOAD')]")).click();
		//Thread.sleep(30000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[2]/a")));
		driver.findElement(By.xpath("/html/body/div[7]/div[2]/a")).click();
*/		
		/*wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/div[3]/a[contains(text(),'Edit')]")));
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/div[3]/a[contains(text(),'Edit')]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Publish']")));
		driver.findElement(By.xpath("//div[text()='PUBLISH']")).click();*/
		//Thread.sleep(4000);
		//driver.close();
	}
}
