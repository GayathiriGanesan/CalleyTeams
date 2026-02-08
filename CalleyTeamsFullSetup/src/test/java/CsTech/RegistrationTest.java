package CsTech;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompages.RegistrationPage;

public class RegistrationTest {
	public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	RegistrationPage regPage = new RegistrationPage(driver);
	regPage.regPageOpen();
	regPage.fillregistration("Mithra","MithraDiya1606@gmail.com", "Mith123","9360840687","ignored");
	regPage.signUp();
	}
}

//	public void demo()
//		{
//		driver.findElement(By.id("txtName")).sendKeys("Gayathiri");
//		driver.findElement(By.id("txtEmail")).sendKeys("gayathirigcse@gmail.com");
//		driver.findElement(By.id("txtPassword")).sendKeys("gaya123");
//		driver.findElement(By.id("txt_mobile")).sendKeys("9360840687");
//		driver.findElement( By.xpath("//label[@for='checkbox-signup']")).sendKeys("ignored");
//		   driver.findElement(By.linkText("Terms and Conditions")).click();
//			driver.findElement(By.id("btnSignUp")).click();
//		}
	

