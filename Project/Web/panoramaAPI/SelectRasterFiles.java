package panoramaAPI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRasterFiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://52.18.28.218:8005/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[@title='Open']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='tablinks'][contains(text(),'Raster')]")).click();
		driver.findElement(By.xpath("//a[@class='formatJPG']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[@title='Open']")).click();
		//driver.findElement(By.xpath("//button[@class='tablinks'][contains(text(),'Raster')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='formatPNG']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[@title='Open']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='tablinks'][contains(text(),'Raster')]")).click();
		driver.findElement(By.xpath("//a[@class='formatTIF']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[@title='Open']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='tablinks'][contains(text(),'Raster')]")).click();
		driver.findElement(By.xpath("//a[@class='formatTIFF']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[@title='Open']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='tablinks'][contains(text(),'Raster')]")).click();
		driver.findElement(By.xpath("//a[@class='formatBMP']")).click();
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[@title='Open']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='tablinks'][contains(text(),'Raster')]")).click();
		driver.findElement(By.xpath("//a[@class='formatGIF']")).click();
	}

}
