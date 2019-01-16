package eda6;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://52.16.165.186:8001");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='init_btn']")).click();
		
		
	//login page
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("bithika@csoftindia.net");
		driver.findElement(By.id("Password")).sendKeys("Admin");
		driver.findElement(By.id("btnSubmit")).click();
		//Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.id("btnSubmit_Seesioncheck")).click();
		Thread.sleep(5000);
		
		WebDriverWait files=new WebDriverWait(driver,10000);
		files.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='File_Uploads']/a/span[1]")));
		driver.findElement(By.xpath("//li[@id='File_Uploads']/a/span[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@id='Uploads']/a")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@id='filename']/span")).click();
		Thread.sleep(4000); 
		Runtime.getRuntime().exec("C:\\Users\\arka\\Desktop\\AutoIT\\fileUpload.exe");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='uploaddoc']")).click();
		 
		
		
		}
		
	
		
	}

