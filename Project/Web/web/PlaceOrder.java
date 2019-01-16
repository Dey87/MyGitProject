package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PlaceOrder {
	
	
	//public WebDriver driver;
	
	
	@Test
	public void NewOrder() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://csoft.com/testcsoft_login");
		driver.manage().window().maximize();
		
	
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id='login']/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id='username1']")).sendKeys("arka@csoftindia.net");
		driver.findElement(By.xpath("//*[@id='password1']")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
		
	/*Methods partnerLogin=new Methods();
	partnerLogin.login();
	*/
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    WebElement element = driver.findElement(By.xpath("//*[@id='header']/div[2]/ul/li[2]/a"));

    Actions action = new Actions(driver);

    action.moveToElement(element).build().perform();

    driver.findElement(By.xpath("//*[@id='header']/div[2]/ul/li[2]/ul/li[1]/a")).click();
}
	
}
