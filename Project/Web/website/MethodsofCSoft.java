package website;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodsofCSoft {
	
	public WebDriver driver = null;
	
	
	public void LandingPage() throws InterruptedException, IOException {
		
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\arka\\eclipse-workspaceNew\\Project\\Web\\website\\Datadriven.properties");
		prop.load(fis);
		System.setProperty(prop.getProperty("driver"), prop.getProperty("driverpath"));
		driver=new ChromeDriver();
		driver.get(prop.getProperty("urlpartner"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id='login']/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id='username1']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//*[@id='password1']")).sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
	}
	
	
	public void loginSuperadmin2() throws InterruptedException, IOException {

		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\arka\\eclipse-workspaceNew\\Project\\Web\\website\\Datadriven.properties");
		prop.load(fis);
		System.setProperty(prop.getProperty("driver"), prop.getProperty("driverpath"));
		driver=new ChromeDriver();
		driver.get(prop.getProperty("urlSuperadmin"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(prop.getProperty("usernamesuperadmin"));
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(prop.getProperty("passwordsuperadmin"));
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/fieldset/p/input")).click();
	
		driver.findElement(By.xpath("//*[@id='product']/a/span")).click();
		driver.findElement(By.xpath("//*[@id='content']/a/button")).click();
		driver.findElement(By.xpath("//*[@id='AddempModal']/form/fieldset/div[1]/label[2]/div/span")).click();
		
		Select ProductFamily = new Select(driver.findElement(By.id("Family_ID")));
		ProductFamily.selectByIndex(1);
		
		Select wiseimagetype = new Select(driver.findElement(By.id("wisepro")));
		wiseimagetype.selectByIndex(2);
		
		driver.findElement(By.id("prod_no")).sendKeys(" ");
		driver.findElement(By.id("prod_no_tripletex")).sendKeys(" ");
		
		Select version = new Select(driver.findElement(By.id("Version")));
		version.selectByIndex(2);
		
		driver.findElement(By.id("new_release")).sendKeys(" ");
		driver.findElement(By.id("prod_price_NOK")).sendKeys(" ");
		driver.findElement(By.id("prod_price_EURO")).sendKeys(" ");
		driver.findElement(By.id("prod_price_USD")).sendKeys(" ");
		driver.findElement(By.id("Comment")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='AddempModal']/form/fieldset/div[19]/label[2]/div/span")).click();
	//submit	
	//driver.findElement(By.xpath("//*[@id='AddempModal']/form/fieldset/div[20]/input"));
	
}
	
	
}
