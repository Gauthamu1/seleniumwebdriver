package learning1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning2_locators {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		//using class name
		//List<WebElement> headerlinks=driver.findElements(By.className("dropdown"));
		//System.out.println("no of groupelements are " +headerlinks.size());
		   
		List<WebElement> elemnt=driver.findElements(By.tagName("a")); //return all the link in form of web elements 
		System.out.println("the no of links are "+ elemnt.size());
		
		List<WebElement>Img=driver.findElements(By.tagName("img"));
		System.out.println("the no of images are" + Img.size());
		
	}

	
}
