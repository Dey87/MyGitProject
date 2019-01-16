import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapchaTest {

	public static void main(String[] args) throws InterruptedException, ScriptException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://csoft.com/captchatest");
		driver.manage().window().maximize();
		
		
	for(int i=0;i<30;i++) {
			
			
		driver.findElement(By.xpath("//input[@id='p1']")).sendKeys("arka"); //first name*
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='p2']")).sendKeys("dey");  //last name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='p3']")).sendKeys("pradipta@csoftindia.net");   //email address*
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='p4']")).sendKeys("64296462464646464");   //phone number*
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='p5']")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");  //enter enquiry*
		
		WebElement capcha = driver.findElement(By.xpath("//span[@class='captcha']"));
		String equation = capcha.getText();
		System.out.println(equation);
		
		 ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		    String foo = equation;
		    System.out.println(engine.eval(foo));
		    
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@id='p9']")).sendKeys(""+engine.eval(foo)+"");
		    
		    //Thread.sleep(1000);
		    //driver.findElement(By.xpath("//button[@type='button'][contains(text(),'Reset')]")).click();
		    driver.findElement(By.xpath("//button[@type='button'][contains(text(),'Send Message')]")).click();
		    Thread.sleep(2000);
		    //driver.quit();
		    driver.navigate().refresh();
		    Thread.sleep(2000);
		    
		    		
		
	}

	}

}
