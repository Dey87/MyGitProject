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
public class LockTest {

	//private static final TimeUnit SECONDS = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.csoft.com/testcsoft/superadmin2/");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("admin212");
		//thread.sleep(3000L);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='hidden-tablet'][contains(text(),'Locks')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-large btn-primary']")).click();
		driver.findElement(By.xpath("//input[@id='distname']")).sendKeys("CSoft Test account");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//html//div[@class='box span12']//li[2]")).click();
		
		for(int i=0; i<10; i++)
		{
			
			driver.findElement(By.xpath("//html//div[@class='control-group']/input[1]")).click();
			
			
		 }
		int j=1;
		for(int i=0; i<10; i++)
			
         {
			
			driver.findElement(By.xpath("//input[@id='lockno"+j+"']")).sendKeys("Rakesh_bose"+j+"");
			j++;
			
		 }
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='load']")).click();
		
		
		
		
		}

	
}
