package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void login()
	{
		pageobjectmodel id=new pageobjectmodel(driver);
		id.setusername("admin");
		id.setpwd("admin123");
		id.clickbtn();
	}
	@AfterTest
	void Close() 
	{
		driver.quit();
	}
	

}
