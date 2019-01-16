package panoramaAPI;

import java.awt.List;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileRotation {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://52.18.28.218:8005/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[@title='Open']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='tablinks'][contains(text(),'Raster')]")).click();
		java.util.List<WebElement> allLinks=driver.findElements(By.xpath("//a[contains(@class,'format')]"));
		int j=0;
		
		//Iterator<WebElement> itr = allLinks.iterator();
		/*while(itr.hasNext()) {
		   allLinks.get(j).click();
		   j++;
		}*/
		
		
		//Raster files
		System.out.println(allLinks.size());
		for(int i=0;i<6;i++){
			 System.out.println(allLinks.get(i).getText());
			 allLinks.get(j).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-undo']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//span[@class='glyphicon glyphicon-resize-horizontal']")).click();
			    Thread.sleep(2000);
			    
			  driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-undo']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//span[contains(@class,'glyphicon glyphicon-resize-vertical')]")).click();
			   Thread.sleep(2000);
			    
			   
			  driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-undo']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-move']")).click();
			   Thread.sleep(2000); 
			    
			  driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-undo']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-move']")).click();
			   Thread.sleep(2000); 
			    
			    
			    
				driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
				driver.findElement(By.xpath("//span[@title='Open']")).click();
				Thread.sleep(2000);
				j++;
			 }
		
		
		//CAD files
		driver.findElement(By.xpath("//button[@class='tablinks'][contains(text(),'CAD')]")).click();
		System.out.println(allLinks.size());
		for(int i=0;i<8;i++){
			 System.out.println(allLinks.get(i).getText());
			 allLinks.get(j).click();
			    Thread.sleep(2000);
			    
			    driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-repeat']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//span[@class='glyphicon glyphicon-resize-horizontal']")).click();
			    Thread.sleep(2000);
			    
			  driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-repeat']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//span[contains(@class,'glyphicon glyphicon-resize-vertical')]")).click();
			   Thread.sleep(2000);
			    
			   
			  driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-repeat']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-move']")).click();
			   Thread.sleep(2000); 
			    
			  driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-repeat']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-move']")).click();
			   Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
				driver.findElement(By.xpath("//span[@title='Open']")).click();
				Thread.sleep(2000);
				j++;
			 }
		
		
		//for pdf
		driver.findElement(By.xpath("//button[@class='tablinks'][contains(text(),'PDF')]")).click();
		System.out.println(allLinks.size());
		for(int i=0;i<2;i++){
			 System.out.println(allLinks.get(i).getText());
			 allLinks.get(j).click();
			    Thread.sleep(2000);
			    
			    driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-undo']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//span[@class='glyphicon glyphicon-resize-horizontal']")).click();
			    Thread.sleep(2000);
			    
			  driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-undo']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//span[contains(@class,'glyphicon glyphicon-resize-vertical')]")).click();
			   Thread.sleep(2000);
			    
			   
			  driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-repeat']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-move']")).click();
			   Thread.sleep(2000); 
			    
			  driver.findElement(By.xpath("//div[@id='footer1']//div[@align='center']//ul//li//i[@class='fa fa-repeat']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-move']")).click();
			   Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
				driver.findElement(By.xpath("//span[@title='Open']")).click();
				Thread.sleep(2000);
				j++;
			 }
		
	}
	
}
		