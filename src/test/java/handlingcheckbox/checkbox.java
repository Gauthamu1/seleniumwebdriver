package handlingcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement item= driver.findElement(By.xpath("//input[@id='sunday']"));
		Actions action = new Actions(driver);
		action.moveToElement(item).perform();
		
		List<WebElement> Checkbox= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//for(int i=0;i<Checkbox.size();i++)
		//{ 											//THIS will select all the checkboxes
		//	Checkbox.get(i).click();
		//}
		
		// this is for only selected checkbox
		
		for(int i = 4; i< Checkbox.size();i++) {
			
			Checkbox.get(i).click();
			
		}
			
	}

	
		
	}
	
	


