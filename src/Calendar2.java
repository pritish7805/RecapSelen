import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		//Implicit Wait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //eMassEntry Link
		  driver.get("https://testsso.secure.fedex.com/L3/eShipmentGUI/MenuPage.iface");
		  
		  // Login eMassEntry
		  driver.findElement(By.cssSelector("#username")).sendKeys("874531");
		  driver.findElement(By.cssSelector("#password")).sendKeys("874531");
		  driver.findElement(By.cssSelector("#submit")).click();
		  
		  //Clicking on java Alert.
		  driver.switchTo().alert().accept();
		  
		  //Navigate through dropdwon and select the app
		  driver.switchTo().frame(1);
		  driver.findElement(By.cssSelector("#appNav")).click();
		  		  
		  //directly by xpath
		  //driver.findElement(By.xpath("//option[contains(text(),'eMassEntry')]")).click();
		  
		  //using select class
		  Select s=new Select(driver.findElement(By.cssSelector("#appNav")));
		  s.selectByValue("DisplayLinkHandler?id=351");
		  driver.findElement(By.cssSelector("#appNav")).click();

		  //getting the number of apps in the dropdown and printing 
		  System.out.println(driver.findElements(By.tagName("option")).size());
		  		  List<WebElement> allText = driver.findElements(By.tagName("option"));
		  		  
		  		  //Using enhanced for loop for(int x: a)  used when array a[] contains different integers and we need to traverse through the array
	       for ( WebElement element: allText) 
	       { 
	           System.out.println(element.getText());
	        
	      //driver.close(); //closes current browser
		   }
	       Actions a =new Actions(driver);
	       WebElement we=driver.findElement(By.cssSelector("#locationField"));
	       we.sendKeys("COSA");
	       a.sendKeys(Keys.ENTER).build().perform();
	       
	       //Selecting the scan from Menu
	       WebElement p=driver.findElement(By.xpath("//span[text()='Pickup']"));
	       a.moveToElement(p);
	       String javaScript = "var evObj = document.createEvent('MouseEvents');" +
                  "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
               "arguments[0].dispatchEvent(evObj);";

   JavascriptExecutor js = (JavascriptExecutor)driver;

   //Pass element on which mouse hover to be performed
   js.executeScript(javaScript,p);
   WebElement p1=driver.findElement(By.xpath("//span[text()='PUP - Package Pick Up']"));
   //js.executeScript(javaScript,p1);
   js.executeScript("arguments[0].click();", p1);
   
	}

}
