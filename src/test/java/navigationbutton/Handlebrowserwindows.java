package navigationbutton;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlebrowserwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		WebElement window2 = driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		window2.click();
		
		Set<String> WindowIDs = driver.getWindowHandles();
		//approach1
		List<String> WindowList= new ArrayList(WindowIDs);
		String parentID =WindowList.get(0);
		String childId= WindowList.get(1);
		
		//switch to child window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());		
	}

}
