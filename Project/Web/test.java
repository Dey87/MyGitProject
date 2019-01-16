
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	
		public WebDriver driver;
	    public String baseUrl ="http://csoft.com/testcsoft_login";
	
	@Test
	public void login1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		
		//driver.manage().deleteAllCookies();
		/*driver.findElement(By.xpath("//*[@id='login']/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id='username1']")).sendKeys("arka@csoftindia.net");*/
		/*driver.findElement(By.xpath("//*[@id='password1']")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();*/
		
	}
	
	
	
	/*@AfterTest
	public void login2() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://csoft.com/testcsoft_login");
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id='login']/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id='username1']")).sendKeys("susmita@csoftindia.net");
		driver.findElement(By.xpath("//*[@id='password1']")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
	}*/
	
	/*@AfterTest
	public void login3() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://csoft.com/testcsoft_login");
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id='login']/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id='username1']")).sendKeys("akash@csoftindia.net");
		driver.findElement(By.xpath("//*[@id='password1']")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
	}*/
}
