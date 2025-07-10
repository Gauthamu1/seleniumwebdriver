package learning1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class csslocatiors {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/index.php?route=common/home");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("tshirt");
		WebElement check=driver.findElement(By.xpath("//a[normalize-space()='MacBook']"));
		Actions action = new Actions(driver);
		action.moveToElement(check);
		Boolean element=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(element);
	}

}

