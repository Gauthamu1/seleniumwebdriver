package learning1;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		String act=driver.getTitle();
		
		if(act.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
			
			System.out.println("the title is matching");
		WebElement element= driver.findElement(By.xpath("//div[normalize-space()='Connect with Us']"));
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
		
		WebElement click= driver.findElement(By.xpath(""));
		Thread.sleep(2000);
		driver.quit();
	}

}
