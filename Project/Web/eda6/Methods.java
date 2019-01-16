package eda6;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Methods {

	public WebDriver driver = null;
	public void LandingPage() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\arka\\eclipse-workspaceNew\\Project\\Web\\eda6\\Datadriven.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("baseurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='init_btn']")).click();
		
	//login page
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys((prop.getProperty("username")));
		driver.findElement(By.id("Password")).sendKeys((prop.getProperty("password")));
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(5000);
		// driver.switchTo().alert().accept();
		driver.findElement(By.id("btnSubmit_Seesioncheck")).click();
			
	}
	
	
	
	public void DepartmentLandingPage() throws InterruptedException, IOException {
		
		LandingPage();
		
		WebDriverWait department=new WebDriverWait(driver,20);
		department.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='projects']/a/span")));
		driver.findElement(By.xpath("//li[@id='projects']/a/span")).click();
		Thread.sleep(2000);
		
	}
	
	//add a role
		/*WebDriverWait role=new WebDriverWait(driver,15);
		role.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='Roles']/a/span")));
		
		driver.findElement(By.xpath("//li[@id='Roles']/a/span")).click();
		driver.findElement(By.id("add_role")).click();
		driver.findElement(By.id("Text4")).sendKeys("Manager");
		driver.findElement(By.id("Textarea5")).sendKeys("An user have been created for test purpose");
		int j=1000;
		for(int i=0;i<17;i++)
		{
			
			driver.findElement(By.xpath("//input[@id='"+j+"']")).click();
			j=j+2;
		}
		
		driver.findElement(By.id("btn_addRole")).click(); */
		
		
		
		
		
	//add a user
		//WebDriverWait user=new WebDriverWait(driver,20);
		//user.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='Users']/a/span")));
		
		/*driver.findElement(By.xpath("//li[@id='Users']/a/span")).click();
		driver.findElement(By.id("Add_user")).click();
		driver.findElement(By.id("add_role")).click();
		driver.findElement(By.id("Text4")).sendKeys("User");
		driver.findElement(By.id("Textarea5")).sendKeys("An user have been created for test purpose");*/
		
	//making a department
		
		//WebDriverWait department=new WebDriverWait(driver,20);
		//department.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='projects']/a/span")));
		
		//driver.findElement(By.xpath("//li[@id='projects']/a/span")).click();
		
	//add a department
		//driver.findElement(By.id("adddept")).click();
		
		
	}

