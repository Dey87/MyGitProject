import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class login {
	
	public void loginpartner() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\arka\\eclipse-workspaceNew\\Project\\Web\\datadriven.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		prop.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.get("url");
		System.out.println(prop.getProperty("username"));
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("asd");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("asd");
	}
	

}
