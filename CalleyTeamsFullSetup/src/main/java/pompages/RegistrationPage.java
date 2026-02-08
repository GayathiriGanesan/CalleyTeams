package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtName")
	WebElement entername;
	@FindBy(id="txtEmail")
	WebElement entermail;
	@FindBy(id="txtPassword")
	WebElement enterpassword;
	@FindBy(id="txt_mobile")
	WebElement entermobile;
	@FindBy(xpath="//label[@for='checkbox-signup']")
	WebElement checkBox;
	@FindBy(linkText = "Terms and Conditions")
	WebElement terms;
	@FindBy(id="btnSignUp")
	WebElement signup;
	
	public void regPageOpen()
	{
		driver.get("https://app.getcalley.com/registration.aspx");
	}
	public void fillregistration(String name,String mail,String password,String mobile,String ignore)
	{
		entername.sendKeys(name);
		entermail.sendKeys(mail);
		enterpassword.sendKeys(password);
		entermobile.sendKeys(mobile);
		checkBox.sendKeys(ignore);
	}
	public void signUp() 
	{
		terms.click();
		signup.click();
	
	}
}
