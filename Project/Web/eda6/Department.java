package eda6;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Department extends Methods {
	
	@BeforeTest
	public void AddDepartment() throws InterruptedException, IOException {
	
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\arka\\eclipse-workspaceNew\\Project\\Web\\eda6\\Datadriven.properties");
		prop.load(fis);
		DepartmentLandingPage();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='adddept']")).click();
		driver.findElement(By.id("Text1")).sendKeys("DepartmentTest");
		driver.findElement(By.id("Textarea1")).sendKeys((prop.getProperty("description")));
		driver.findElement(By.xpath("//*[@id='add-admin']/img")).click();
		driver.findElement(By.id("AdminID2")).click();
		/*WebDriverWait files=new WebDriverWait(driver,10000);
		files.until(ExpectedConditions.elementToBeClickable(By.id("updatedepartmentimg_edit")));*/
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("adddepticon"));
		Actions action = new Actions(driver);
	    action.moveToElement(element).build().perform();

		driver.findElement(By.id("updatedepartmentimg_edit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Span1']/span")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\arka\\Desktop\\AutoIT\\fileupload.exe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='upload_departmentpic']/section/div/div[2]/div/form/div/div/div/div[3]/input")).click();
		WebDriverWait submit=new WebDriverWait(driver,10000);
		submit.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
		driver.findElement(By.id("btnSubmit")).click();
	
	
	}
	

	@Test
	public void AddExistDepartment() throws InterruptedException, IOException {
		
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\arka\\eclipse-workspaceNew\\Project\\Web\\eda6\\Datadriven.properties");
		prop.load(fis);
		DepartmentLandingPage();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='adddept']")).click();
		driver.findElement(By.id("Text1")).sendKeys("DepartmentTest");
		driver.findElement(By.id("Textarea1")).sendKeys((prop.getProperty("description")));
		driver.findElement(By.xpath("//*[@id='add-admin']/img")).click();
		driver.findElement(By.id("AdminID2")).click();
		WebDriverWait submit=new WebDriverWait(driver,10000);
		submit.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
		Thread.sleep(1000);
		driver.findElement(By.id("btnSubmit")).click();
		WebElement error=driver.findElement(By.id("error"));
		String emsg=error.getText();
		System.out.println(emsg);
	
	}
	
	
	
	/*@Test
	public void DepartmentBlankSubmit() throws InterruptedException, IOException {
			
		
		DepartmentLandingPage();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("adddept")).click();
		driver.findElement(By.id("Text1")).sendKeys("    ");
		driver.findElement(By.id("Textarea1")).sendKeys(("    "));
		driver.findElement(By.xpath("//*[@id='add-admin']/img")).click();
		driver.findElement(By.id("AdminID2")).click();
		driver.findElement(By.id("btnSubmit")).click();
		
	
	}
	
	
	@AfterTest
	public void DepartmentSpecialCharacterSubmit() throws InterruptedException, IOException {
			
		
		DepartmentLandingPage();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("adddept")).click();
		driver.findElement(By.id("Text1")).sendKeys("!@#$%^&*()_+~`\":';?><,./");
		driver.findElement(By.id("Textarea1")).sendKeys(("!@#$%^&*()_+~`\":';?><,./"));
		driver.findElement(By.xpath("//*[@id='add-admin']/img")).click();
		driver.findElement(By.id("AdminID2")).click();
		driver.findElement(By.id("btnSubmit")).click();				
	
	}*/
	
}

