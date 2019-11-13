import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      
      driver.get("http://jqueryui.com/droppable/");
      System.out.println(driver.findElements(By.tagName("iframe")).size());
      driver.switchTo().frame(0);
      
      Actions a=new Actions(driver);
      WebElement source=driver.findElement(By.cssSelector("#draggable"));
      WebElement target=driver.findElement(By.cssSelector("#droppable"));
      a.dragAndDrop(source, target).build().perform();
      
      driver.switchTo().defaultContent();
      
      
	}

}
