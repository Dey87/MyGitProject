package panoramaAPI;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class magnifyingGlass {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-search']")).click();
		Thread.sleep(2000);
		/*org.openqa.selenium.Point coordinates = driver.findElement(By.xpath("//*[@id=\"imageId\"]")).getLocation();
		  Robot robot = new Robot();
		  robot.mouseMove(coordinates.getX(),coordinates.getY()+120);*/
		
		
		 /* Actions builder = new Actions(driver);

		  WebElement someElement = ;
		WebElement someOtherElement = null;
		builder.keyDown(Keys.CONTROL)
		     .click(someElement)
		     .moveByOffset( 10, 25 )
		     .click(someOtherElement)
		     .keyUp(Keys.CONTROL).build().perform();*/
		
		
		
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"global\"]"));
		//Used points class to get x and y coordinates of element.
		org.openqa.selenium.Point point = element.getLocation();
		int xcord = point.getX();
		System.out.println("Position of the webelement from left side is "+xcord +" pixels");
		int ycord = point.getY();
		System.out.println("Position of the webelement from top side is "+ycord +" pixels");
		// Using Actions class
                Actions action = new Actions(driver);
                //clicking on the logo based on x coordinate and y coordinate 
                //you will be redirecting to the home page of softwaretestingmaterial.com
                action.moveToElement(element, xcord, ycord).click().build().perform();
               /*((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+element.getLocation().y+")");
               element.click();*/
               /*JavascriptExecutor executor = (JavascriptExecutor) driver;
               executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
               executor.executeScript("arguments[0].click();", element);*/
	} 
}

		
	

