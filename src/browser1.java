import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		/*driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.apple.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();*/
		driver.manage().window().maximize();
		driver.get("https://dev.secure.fedex.com/L3/SPOQ/EspSPOQ.html");
		driver.findElement(By.name("username")).sendKeys("874531");
		//driver.findElement(By.xpath("//input[contains(@id,'userna')]")).sendKeys("874531");
		driver.findElement(By.id("password")).sendKeys("874531");
		driver.findElement(By.id("submit")).click();
		System.out.println(driver.getTitle());
		
		//clicked 3 different queries to open 3 different windows
		driver.findElement(By.linkText("consId")).click();
		driver.findElement(By.linkText("relationship")).click();
		driver.findElement(By.linkText("trackNbrSummary")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String windowtitle=it.next();
		//printing all child window titles
//		for (int i=1;i<4;i++)
//		{
//			windowtitle=it.next();
//			driver.switchTo().window(windowtitle);
//			System.out.println(driver.getTitle());
//		}
		//printing all child window titles using while loop
		while(it.hasNext())
		{
			windowtitle=it.next();
			driver.switchTo().window(windowtitle);
			System.out.println(driver.getTitle());
		}
		
		
		
		
	}

}
