import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        
       driver.get("https://www.amazon.com/");
       WebElement we= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
       Actions a =new Actions(driver);
       
       a.moveToElement(we).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
       a.moveToElement(driver.findElement(By.cssSelector(".hm-icon.nav-sprite"))).contextClick().build().perform();
      
      
	}

}
