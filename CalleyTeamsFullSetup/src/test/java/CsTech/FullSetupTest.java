package CsTech;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pompages.AgentPage;
import pompages.CsvUploadPage;
import pompages.LoginPage;

public class FullSetupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//disable popup
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-notifications");
				WebDriver driver = new ChromeDriver(options);
				driver.manage().window().maximize();
		
		
	//object creation for LoginPage
		LoginPage login=new LoginPage(driver);
		login.goTo();
		login.loginApplication("MithraDiya1606@gmail.com", "Mith123");
		
	//Object creation for AgentPage
		AgentPage agent = new AgentPage(driver);
		agent.AddAgents("Agent","0123456789","abc123@gmail.com","0123");
		
	//Object creation for CsvUploadPage
		CsvUploadPage csvPage = new CsvUploadPage(driver);
		csvPage.uploadFile("Test List","C:\\\\File.xlsx");
		
		
		 
		
//		//driver.findElement(By.className(".team_top")).click();
//		WebElement mainMenu = driver.findElement(By.xpath("//a[@href='teams.aspx']"));
//        Actions actions = new Actions(driver);
//		actions.moveToElement(mainMenu).perform();
//		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement subMenuItem = driver.findElement(By.xpath("//a[.//span[normalize-space()='Agents']]"));
//        		subMenuItem.click();
//        		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("Agent1");
//        		driver.findElement(By.xpath("//div[@title='India: +91']")).click();
//        		driver.findElement(By.xpath("//span[normalize-space()='India']")).click();
//        		driver.findElement(By.xpath("//input[@placeholder='Enter mobile no.']")).sendKeys("0123456789");
//        		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("Agent1234@gmail.com");
//        		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("abc123");
//        		driver.findElement(By.id("ContentPlaceHolder1_btn_submit")).click();
//        		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        		//Call List
//        		WebElement callList = driver.findElement(By.xpath("//a[.//span[normalize-space()='Call List']]"));
//        		actions.moveToElement(callList).perform();
//        		driver.findElement(By.xpath("//span[normalize-space()='Add - Power Import']")).click();
//        		driver.findElement(By.id("ContentPlaceHolder1_txtlistname")).sendKeys("Test List");
//        		driver.findElement(By.xpath("//button[@title='Please select an agent']")).click();
//        		driver.findElement(By.xpath("//label[@class='checkbox']/input[@value='all']")).click();
//        		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_divagents\"]/div/div/button")).click();
        		
//        		WebElement upload = driver.findElement(By.id("ContentPlaceHolder1_fileUpload"));
//        		upload.sendKeys("C:\\File.xlsx");
//        		driver.findElement(By.xpath("//p[@id='btnUp']")).click();
//        		driver.findElement(By.xpath("//button[text()='Ok']")).click();      		
        		
        		
	}

}
