import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EQS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//get to the link
			driver.get("https://dev.secure.fedex.com/L3/SPOQ/EspSPOQ.html");
			//login
			driver.findElement(By.name("username")).sendKeys("874531");
			driver.findElement(By.id("password")).sendKeys("874531");
			driver.findElement(By.id("submit")).click();
			//count the number of links
			System.out.println(driver.findElements(By.tagName("a")).size());
			//count number of links in Common Queries by creating driver subset
			WebElement commdriver =driver.findElement(By.xpath("//div[@class='panel-body']"));
			System.out.println(commdriver.findElements(By.tagName("a")).size());
			
			//Clicking on all common queries
			for(int i=1;i<commdriver.findElements(By.tagName("a")).size();i++)
			{
				commdriver.findElements(By.tagName("a")).get(i).click();
			}
			
			
	}

}
