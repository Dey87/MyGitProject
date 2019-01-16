package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Panorama_needHelp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.csoft.com/product/html5-document-viewer");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='newpost']/div[3]/a[2]")).click();
		driver.findElement(By.id("name")).sendKeys("  ");
		driver.findElement(By.id("contact")).sendKeys("         ");
		driver.findElement(By.id("email")).sendKeys("    ");
		driver.findElement(By.id("message")).sendKeys("    ");
		
		driver.findElement(By.id("agreepri")).click();
		driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[2]/div/div[2]/form/ul/li[7]/button")).click();
			
	}

}
