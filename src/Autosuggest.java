import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   
   driver.get("https://www.makemytrip.com/");
   driver.manage().window().maximize();
   Thread.sleep(2000L);
   driver.findElement(By.xpath("//input[@id='fromCity']")).click();
   //Replacing repetitive xpaths by using WebElement
   WebElement fromcity= driver.findElement(By.xpath("//input[@placeholder='From']"));
   
   /*driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("DEL");
   Thread.sleep(2000L);
   for (int i=1;i<5;i++)
   {
   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
   }
   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
   */
   fromcity.clear();
   fromcity.sendKeys("DEL");
   Thread.sleep(2000L);
   for (int i=1;i<5;i++)
   {
	   fromcity.sendKeys(Keys.ARROW_DOWN);
   }
   fromcity.sendKeys(Keys.ENTER);

   /*WebElement tocity= driver.findElement(By.xpath("//input[@placeholder='To']"));
   tocity.clear();
   tocity.sendKeys("MUM");
   Thread.sleep(2000L);
   for (int i=1;i<4;i++)
   {
	   tocity.sendKeys(Keys.ARROW_DOWN);
   }
   tocity.sendKeys(Keys.ENTER);*/
   
 driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-5']")).click();
	}
	//div[@class='makeFlex hrtlCenter']
}
