package eda6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingProject {

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
		
		// project
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebDriverWait project=new WebDriverWait(driver,15000);
		project.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='setupLi6']/a")));
		
		driver.findElement(By.xpath("//*[@id='setupLi6']/a	")).click();
		driver.findElement(By.xpath("//*[@id='setup6']/div[2]/button")).click();
		driver.findElement(By.id("txtArchiveName")).sendKeys("Manager");
		driver.findElement(By.id("txtArchiveDes")).sendKeys("Manager");
		driver.findElement(By.xpath("//*[@id='AddARc_fromMenu']/div[2]/div/ul/li/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id='AddARc_fromMenu']/div[2]/div/ul/li/div/div/ul/li[1]/a")).click();
		driver.findElement(By.id("Buttonarc")).click();
		
		
		
	}

}
