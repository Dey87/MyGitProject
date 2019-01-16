import java.awt.List;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
public class GuestRegistration {

	//private static final TimeUnit SECONDS = null;

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.csoft.com//test_cust_guest_register");
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("nilarya");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Talukdar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nilarya#csoftindia.net");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("abc9876543210");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@id='add']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@id='pcode']")).sendKeys("B");
		driver.findElement(By.xpath("//select[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("India");
		driver.findElement(By.xpath("//span[@class='checkmark']")).sendKeys("India");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[@class='hidden-tablet'][contains(text(),'Locks')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-large btn-primary']")).click();
		driver.findElement(By.xpath("//input[@id='distname']")).sendKeys("CSoft Test account");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//html//div[@class='box span12']//li[2]")).click();
		
	}
	
}
