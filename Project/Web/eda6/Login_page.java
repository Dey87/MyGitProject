package eda6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page {
	
	public static void main(String[] args) throws InterruptedException {
	    // TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://52.16.165.186:8001");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='init_btn']")).click();
		
		
	//login page
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("arka@csoftindia.net");
		driver.findElement(By.id("Password")).sendKeys("12345");
		driver.findElement(By.id("btnSubmit")).click();
		//Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.id("btnSubmit_Seesioncheck")).click();
		//Thread.sleep(3000);
		
		
		//add a field
		WebDriverWait fields=new WebDriverWait(driver,10000);
		fields.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='Fields']/a/span")));
		driver.findElement(By.xpath("//li[@id='Fields']/a/span")).click();
		
		//for test purpose
		//driver.findElement(By.xpath("//*[@id='fieldheader]/div/span/a/b")).click();
		
		//WebDriverWait fieldAdd=new WebDriverWait(driver,30000);
		//fieldAdd.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='add_field']")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='add_field']")).click();
		//*[@id='add_field']/i
		//button[@id='add_field']
		//*[@id='fieldheader]/div/span/a/b
		int j=50;	
		for(int i=1;i<j;i++)
			
		{
			
		
			driver.findElement(By.id("CheckboxProjectField")).click();
			driver.findElement(By.id("Text3")).sendKeys("EDAClienttestfield"+i);
			driver.findElement(By.id("Textarea3")).sendKeys("EDAClientintegerfieldcheck"+i);
			j++;
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='Fieldtype']/a/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='Fieldtype']/div/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("IsMandatory")).click();
			driver.findElement(By.id("Text20")).sendKeys("100");
			driver.findElement(By.xpath("//button[@id='ButtonField']")).click();
			Thread.sleep(10000);
			driver.navigate().refresh();
			//Thread.sleep(6000);
			WebDriverWait field=new WebDriverWait(driver,10000);
			field.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='Fields']/a/span")));
			driver.findElement(By.xpath("//li[@id='Fields']/a/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@id='add_field']")).click();
			
			
		
			
			
			/*driver.findElement(By.xpath("//li[@id='Filters']/a/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[@id='Fields']/a/span")).click();
			Thread.sleep(2000); 
			driver.findElement(By.xpath("//button[@id='add_field']")).click();*/
			
				
		
		}

	}
}
