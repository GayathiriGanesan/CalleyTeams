package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AgentPage {
	WebDriver driver;
	public AgentPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='teams.aspx']")
	WebElement mainMenu;
	@FindBy(xpath = "//a[.//span[normalize-space()='Agents']]")
	WebElement subMenuItem;
	@FindBy(xpath = "//input[@placeholder='Enter name']")
	WebElement entername;
	@FindBy(xpath ="//div[@title='India: +91']" )
	WebElement country;
	@FindBy(xpath = "//input[@placeholder='Enter mobile no.']")
	WebElement entermobile;
	@FindBy(xpath ="//input[@placeholder='Enter email']" )
	WebElement entermail;
	@FindBy(xpath = "//input[@placeholder='Enter password']")
	WebElement enterpassword;
	@FindBy(id ="ContentPlaceHolder1_btn_submit")
	WebElement submit;
	@FindBy(xpath="//button[normalize-space()='OK']")
	WebElement ok;
	@BeforeMethod
	public void teamSelection()
	{
        Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		subMenuItem.click();
	}
	@Test
	public void AddAgents(String name,String mobile,String mail,String password)
	{
	entername.sendKeys(name);
	entermobile.sendKeys(mobile);
	entermail.sendKeys(mail);
	enterpassword.sendKeys(password);
	}
	@AfterMethod
	public void submit()
	{
		submit.click();
		ok.click();
	}

}
