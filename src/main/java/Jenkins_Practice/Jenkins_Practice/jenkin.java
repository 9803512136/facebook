package Jenkins_Practice.Jenkins_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class jenkin {

	static WebDriver driver;
	@BeforeSuite
	public void start_browser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\all software\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void Login() throws InterruptedException
	{
		driver.findElement(By.name("email")).sendKeys("mamtamehta38@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mamta@1996");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
		
	}
	
	
	
	
	
	@AfterSuite
	public void close_browser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	
}
