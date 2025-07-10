package GetMethodsTraining;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		WebElement window2 = driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		window2.click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
	}

}
