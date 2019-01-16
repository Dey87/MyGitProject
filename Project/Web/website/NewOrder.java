package website;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NewOrder extends MethodsofCSoft {
	
	
	public void newAorder() throws InterruptedException, IOException {
		
		LandingPage();
		
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\arka\\eclipse-workspaceNew\\Project\\Web\\website\\Datadriven.properties");
		prop.load(fis);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//*[@id='header']/div[2]/ul/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//*[@id='header']/div[2]/ul/li[2]/ul/li[1]/a")).click();
		
		
	}

}
