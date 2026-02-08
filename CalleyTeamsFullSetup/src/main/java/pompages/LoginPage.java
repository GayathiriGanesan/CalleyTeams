package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(id="txtEmailId")
	WebElement userEmail;
    @FindBy(id="txtPassword")
   	WebElement userPassword;
    @FindBy(id="btnLogIn")
   	WebElement submit;
    
    public void loginApplication(String email,String password)
    {
    	userEmail.sendKeys(email);
    	userPassword.sendKeys(password);
    	submit.click();
    }
    public void goTo() 
    {
    	driver.get("https://app.getcalley.com/Login.aspx");	
	}
}    

