import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enabdisab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testsso.secure.fedex.com/L3/eShipmentGUI/MenuPage.iface");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#username")).sendKeys("874531");
		driver.findElement(By.cssSelector("input#password")).sendKeys("874531");
		driver.findElement(By.cssSelector("input#submit")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("select#appNav")).click();
		driver.findElement(By.xpath("//option[@value='DisplayLinkHandler?id=351']")).click();
		// driver.findElement(By.linkText("Scans")).click();
		// driver.findElement(By.linkText("eMassEntry")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("input#locationField")).sendKeys("COSA");
		driver.findElement(By.cssSelector("button.primaryButton")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name='massEntryForm:locCd_inputtext']")).isEnabled());
		//System.out.println(); //type sysout then Ctrl+Space
	}

}
