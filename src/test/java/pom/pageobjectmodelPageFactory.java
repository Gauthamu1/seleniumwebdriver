package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectmodelPageFactory {
	
	WebDriver driver;
	
	//constructors
	 pageobjectmodelPageFactory(WebDriver driver)
	 {
		 this.driver= driver;
		 PageFactory.initElements(driver,this);
	}
	
	
	//locators 
	 
	 @FindBy(xpath="//input[@placeholder='Username']") WebElement username;	
	 @FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	 @FindBy(xpath="//button[@type='submit']") WebElement Button;
/*	By username = By.xpath("//input[@placeholder='Username']");
	By pass= By.xpath("//input[@placeholder='Password']");
	By btn= By.xpath("//button[@type='submit']");
	
	*/
	//action methods
	
	public void setusername(String user)
	{
		username.sendKeys(user);
	}
	public void setpwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickbtn()
	{
		Button.click();
	}
	
} 
