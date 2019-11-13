import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.hotels.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".cta.widget-overlay-close")).click();
		WebElement dest = driver.findElement(By.id("qf-0q-destination"));
		dest.click();
		dest.clear();
		dest.sendKeys("Las Vegas");
		driver.switchTo().activeElement();
		// tr[@id='citysqm-asi0-s1']//td
		driver.findElement(By.xpath("//tr[@id='citysqm-asi0-s1']//td")).click();
		// WebElement drop1= driver.findElement(By.cssSelector("#citysqm-asi0-s2"));
		// Actions a =new Actions(driver);
		// a.moveToElement(drop1).click().build().perform();
		// dest.sendKeys(Keys.ARROW_DOWN);
		// dest.sendKeys(Keys.ENTER);
		// Explicit Wait
		WebDriverWait w = new WebDriverWait(driver, 7);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q-localised-check-in']")));

		driver.findElement(By.xpath("//input[@name='q-localised-check-in']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='widget-datepicker']")));

		// driver.findElement(By.xpath("//div[@class='widget-daterange-cont']//div[2]//div[2]//table[1]//tbody[1]//tr[4]//td[2]//a[1]")).click();
		// driver.findElement(By.xpath("//input[@id='widget-query-label-1']")).click();
		driver.findElement(By
				.xpath("//div[@class='widget-daterange-cont']//div[2]//div[2]//table[1]//tbody[1]//tr[3]//td[6]//a[1]"))
				.click();
		driver.findElement(By.xpath("//input[@id='qf-0q-localised-check-out']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='widget-datepicker']")));
		driver.findElement(By.xpath(
				"//table[@class='widget-datepicker-contains-selected widget-datepicker-contains-highlight widget-datepicker-contains-range-end']//a[contains(text(),'23')]"))
				.click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cta.cta-strong")));
		driver.findElement(By.cssSelector(".cta.cta-strong")).click();

	}

}
