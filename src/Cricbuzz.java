import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22744/ind-vs-rsa-2nd-test-south-africa-tour-of-india-2019");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		
        int Sum =0;
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for (int j=0 ; j<count-2 ; j++) 
		{
			
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(j).getText();
			System.out.println(value);
			int val=Integer.parseInt(value);
			Sum=Sum+val;

		}
        System.out.println("Sum is :" +Sum);
	}

}
