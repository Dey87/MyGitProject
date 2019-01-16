package website;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DashboardGetLatest extends MethodsofCSoft {
	
	@Test
	public void getLatest() throws InterruptedException, IOException {
		
		LandingPage();
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\arka\\eclipse-workspaceNew\\Project\\Web\\website\\Datadriven.properties");
		prop.load(fis);
		
		driver.findElement(By.xpath("//*[@id='example_filter']/label/input")).sendKeys(prop.getProperty("SL"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List <WebElement> col = driver.findElements(By.xpath("//*[@id='example_wrapper']/div[3]/div[1]/div/table/thead/tr/th"));
	    System.out.println("No of cols are : " +col.size());
	    int i=col.size();
		
	        	for (int j=1;j<=i;j++){
	        	String sColumnName= driver.findElement(By.xpath("//*[@id='example_wrapper']/div[3]/div[1]/div/table/thead/tr/th["+j+"]")).getText();
	        	String sColumnValue= driver.findElement(By.xpath("//*[@id='example']/tbody/tr[1]/td["+j+"]")).getText();													
	        	System.out.println(sColumnName+" : "+sColumnValue);
	        	
	        }
	        	String RC=driver.findElement(By.xpath("//*[@id='example']/tbody/tr[1]/td[5]")).getText();
		
				//Getlatest Page											
	        	driver.findElement(By.xpath("//*[@id='example']/tbody/tr[1]/td[1]/a[1]")).click();
	        	Select Upprolist=new Select(driver.findElement(By.xpath("//*[@id='hide_processing']/table[4]/tbody/tr[3]/td[1]/select")));
	        	Upprolist.selectByIndex(2);
	       
	        	String GLC=driver.findElement(By.id("B~1")).getText();
	        	
	        	driver.findElement(By.id("optionalssacheck")).click();
	        	Select SSAyear=new Select(driver.findElement(By.id("op~1")));
	        	SSAyear.selectByIndex(2);
	        	
	        	System.out.println(RC);
	        	System.out.println(GLC);
	        	
	        	if(RC.equals(GLC)) {
	        		
	        		System.out.println("Test passed");
	        		driver.findElement(By.id("getserial")).click();
	        	}
	        	
	        	else {
	        	
	        		System.out.println("Test failed");
	        		
	        	}	
	        	
	}
	        	
		
	
	}	

