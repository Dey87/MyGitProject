package panoramaAPI;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_loadTest {

	@Test
	 public void loadTesting() throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://csp.csoft.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='myNavbar']/ul[@class='nav navbar-nav']/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//span[@title='Open']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='tablinks'][contains(text(),'Raster')]")).click();
		java.util.List<WebElement> allLinks=driver.findElements(By.xpath("//a[contains(@class,'format')]"));
			
	 }
}
