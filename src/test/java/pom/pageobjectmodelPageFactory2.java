package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectmodelPageFactory2 {

	
	WebDriver driver;
	
	pageobjectmodelPageFactory2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	
	
	public void setusername(String user)
	{
		username.sendKeys(user);
			}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
}