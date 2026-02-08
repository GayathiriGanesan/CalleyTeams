package pompages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CsvUploadPage {
	WebDriver driver;
	public CsvUploadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[.//span[normalize-space()='Call List']]")
	WebElement callList;
	@FindBy(xpath="//span[normalize-space()='Add - Power Import']")
	WebElement powerImport;
	@FindBy(id="ContentPlaceHolder1_txtlistname")
	WebElement txtList;
	@FindBy(xpath="//button[@title='Please select an agent']")
	WebElement agentSelect;
	@FindBy(xpath="//label[@class='checkbox']/input[@value='all']")
	WebElement valueAll;
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_divagents\"]/div/div/button")
	WebElement divAgents;
	@FindBy(id="ContentPlaceHolder1_fileUpload")
	WebElement chooseFile;
	@FindBy(xpath="//p[@id='btnUp']")
	WebElement buttonUp;
	@FindBy(xpath="//button[text()='Ok']")
	WebElement ok;
	@BeforeMethod
	public void powerImport()
	{
		Actions actions = new Actions(driver);
     actions.moveToElement(callList).perform();
     powerImport.click();
        
	}
	@Test
	public void uploadFile(String txt,String filePath)
	{
		txtList.sendKeys(txt);
		agentSelect.click();
		 valueAll.click();
		 divAgents.click();
		 File file = new File(filePath);
		 chooseFile.sendKeys(filePath);
		
	}
	@AfterMethod
	public void AfterUpload()
	{
		buttonUp.click();
		ok.click();
	}
	

}
