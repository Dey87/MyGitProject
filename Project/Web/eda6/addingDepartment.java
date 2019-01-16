package eda6;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addingDepartment {

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
		Thread.sleep(5000);
		driver.findElement(By.id("btnSubmit_Seesioncheck")).click();
		//Thread.sleep(3000);
		
		
		//add a department
		WebDriverWait department=new WebDriverWait(driver,10000);
		department.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='projects']/a/span")));
		driver.findElement(By.xpath("//li[@id='projects']/a/span")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@id='adddept']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Text1']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='Textarea1']")).sendKeys("Selenium Drescription");
		Thread.sleep(2000);
		
		 Actions builder = new Actions(driver);
		 WebElement element = driver.findElement(By.xpath("//a[@id='updatedepartmentimg_edit']"));
		 
		 WebDriverWait hover=new WebDriverWait(driver,15000);
			hover.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='updatedepartmentimg_edit']")));
		 
		 builder.moveToElement(element).click().build().perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='Filedepartment']")).click();
		Thread.sleep(4000); 
		Runtime.getRuntime().exec("C:\\Users\\arka\\Desktop\\AutoIT\\fileUpload.exe");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='upload_departmentpic']/section/div/div[2]/div/form/div/div/div/div[3]/input")).click();
		 
		
	}
}
