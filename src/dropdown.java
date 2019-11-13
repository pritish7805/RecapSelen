import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// enter GNSL URL
		driver.get("https://testsso.secure.fedex.com/L3/egnsl/");
		// Login
		driver.findElement(By.xpath("//input[contains(@id,'userna')]")).sendKeys("874531");
		driver.findElement(By.id("password")).sendKeys("874531");
		driver.findElement(By.id("submit")).click();
		// select buttons to reach ESQI Queries
		driver.findElement(By.xpath("//input[@value='ESQI Queries']")).click();
		driver.findElement(By.xpath("//input[@value='Location Summary']")).click();
		driver.findElement(By.xpath("//input[@name='jobName.jobName']")).sendKeys("TestJob");
		driver.findElement(By.xpath("//input[@name='jobName.fromDate']")).clear();
		driver.findElement(By.xpath("//input[@name='jobName.fromDate']")).sendKeys("08232019");
		driver.findElement(By.xpath("//input[@name='jobName.thruDate']")).clear();
		driver.findElement(By.xpath("//input[@name='jobName.thruDate']")).sendKeys("08272019");
		driver.findElement(By.xpath("//input[@name='jobName.dayWeek']")).click();
		driver.findElement(By.xpath("//textarea[@name='locations.locs']")).sendKeys("MEMH");
		// Check box selected or not?
		System.out.println(driver.findElement(By.xpath("//input[@name='locations.orig']")).isSelected());
		// Check box selected or not?
		driver.findElement(By.xpath("//input[@name='locations.orig']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='locations.orig']")).isSelected());
		// getting size of check boxes on the page
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
		// getting count of check boxes on the page
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		// selecting values from a dropdown
		Select s = new Select(driver.findElement(By.xpath("//select[@name='locations.subTypes']")));
		s.selectByValue("AD");
		s.selectByIndex(5);
		s.selectByVisibleText("KF FACILITY MANAGEMENT");
	}

}
