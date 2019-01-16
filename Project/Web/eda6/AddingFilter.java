package eda6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingFilter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://52.16.165.186:8001");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='init_btn']")).click();
		
		
	//login page
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("systemadmin@csoftindia.net");
		driver.findElement(By.id("Password")).sendKeys("Admin");
		driver.findElement(By.id("btnSubmit")).click();
		//Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.id("btnSubmit_Seesioncheck")).click();
		
		
		//filter
		
		driver.findElement(By.xpath("//*[@id='Filters']/a/span")).sendKeys("systemadmin@csoftindia.net");
		driver.findElement(By.xpath("//*[@id='add_Filter']")).sendKeys("systemadmin@csoftindia.net");
		driver.findElement(By.xpath("//*[@id='Text2']")).sendKeys("systemadmin@csoftindia.net");
		driver.findElement(By.xpath("//*[@id='Textarea6']")).sendKeys("systemadmin@csoftindia.net");
		driver.findElement(By.xpath("//*[@id='Dept_Arc_Filter']/div[2]/div/ul/li/div/a/span")).sendKeys("systemadmin@csoftindia.net");
		driver.findElement(By.xpath("//*[@id='Dept_Arc_Filter']/div[2]/div/ul/li/div/div/ul/li[1]/a")).sendKeys("systemadmin@csoftindia.net");
		driver.findElement(By.xpath("//*[@id='Dept_Arc_Filter']/div[4]/div/ul/li/div/a/span")).sendKeys("systemadmin@csoftindia.net");
		driver.findElement(By.xpath("//*[@id='Dept_Arc_Filter']/div[4]/div/ul/li/div/div/ul/li[1]/a")).sendKeys("systemadmin@csoftindia.net");
		
		driver.findElement(By.xpath("//*[@id='AddRowBtn']")).click();
		
		
	}

}