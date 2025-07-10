package pom;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectmodel {
	
	WebDriver driver;
	
	//constructors
	 pageobjectmodel(WebDriver driver)
	 {
		 this.driver= driver;
	}
	
	
	//locators 
	By username = By.xpath("//input[@placeholder='Username']");
	By pass= By.xpath("//input[@placeholder='Password']");
	By btn= By.xpath("//button[@type='submit']");
	
	
	//action methods
	
	public void setusername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	public void setpwd(String pwd)
	{
		driver.findElement(pass).sendKeys(pwd);
	}
	public void clickbtn()
	{
		driver.findElement(btn).click();
	}
}
