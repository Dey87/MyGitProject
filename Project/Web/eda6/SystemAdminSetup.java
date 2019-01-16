package eda6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SystemAdminSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://52.16.165.186:8001");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='init_btn']")).click();
		
		
	//login page
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("systemadmin@csoftindia.net");
		driver.findElement(By.id("Password")).sendKeys("Admin");
		driver.findElement(By.id("btnSubmit")).click();
		//Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.id("btnSubmit_Seesioncheck")).click();
		
		//Enterprise Profile Setup
		
	/**	//Enterprise
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		WebDriverWait enterprise=new WebDriverWait(driver,15000);
		enterprise.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='setupLi1']/a")));
		driver.findElement(By.xpath("//*[@id='setupLi1']/a")).click();
		Thread.sleep(4000);
		// with blank value
		driver.findElement(By.xpath("//div[@id='setup1']/div[2]/div[2]/div/ul/li[1]/span/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[2]/span/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[3]/span/input")).sendKeys(" "); // phone no
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[4]/span/span[1]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[4]/span/span[2]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[5]/span/span[1]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[5]/span/span[2]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[6]/span/span[1]/input")).sendKeys("   "); //zip code
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[6]/span/span[2]/input")).sendKeys("  ");
		driver.findElement(By.xpath("//*[@id='btnSubmitCompanyProfile']")).click();
		
		
		Thread.sleep(5000);
		
		// With special characters and wrong data
		driver.findElement(By.xpath("//div[@id='setup1']/div[2]/div[2]/div/ul/li[1]/span/input")).sendKeys(" $%#%$####"); //name
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[2]/span/input")).sendKeys("$$#%%  $#@.@%$#%$$ "); // email ID
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[3]/span/input")).sendKeys(" dsdfvrgxfgdgdfc57321587638753   dsfds4345"); // phone no
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[4]/span/span[1]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[4]/span/span[2]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[5]/span/span[1]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[5]/span/span[2]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[6]/span/span[1]/input")).sendKeys("   "); //zip code
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[6]/span/span[2]/input")).sendKeys("  ");
		driver.findElement(By.xpath("//*[@id='btnSubmitCompanyProfile']")).click();
		
		
		Thread.sleep(5000);
		
		// provide value only for name, mail and contact field, other fields keep empty and using space between word and digit
		driver.findElement(By.xpath("//div[@id='setup1']/div[2]/div[2]/div/ul/li[1]/span/input")).clear();
		driver.findElement(By.xpath("//div[@id='setup1']/div[2]/div[2]/div/ul/li[1]/span/input")).sendKeys(" CSoft"); //name
		
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[2]/span/input")).clear();
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[2]/span/input")).sendKeys(" info@coft.com "); // email ID
		
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[3]/span/input")).clear();
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[3]/span/input")).sendKeys(" 454 54536 464 4 "); // phone no
		
		
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[4]/span/span[1]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[4]/span/span[2]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[5]/span/span[1]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[5]/span/span[2]/input")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[6]/span/span[1]/input")).sendKeys("   "); //zip code
		driver.findElement(By.xpath("//*[@id='setup1']/div[2]/div[2]/div/ul/li[6]/span/span[2]/input")).sendKeys("  ");
		driver.findElement(By.xpath("//*[@id='btnSubmitCompanyProfile']")).click();
		
		/** Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id='A20']"));
		 
		WebDriverWait hover=new WebDriverWait(driver,15000);
		hover.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='A20']")));
		builder.moveToElement(element).click().build().perform(); 
		
		
		
		
		
		
		//System
		
		Thread.sleep(5000);
		//with blank value
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebDriverWait system=new WebDriverWait(driver,15000);
		system.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='setupLi2']/a")));
		
		driver.findElement(By.xpath("//*[@id='setupLi2']/a	")).click();
		
		driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[1]/span/input")).sendKeys(" ");  //email
		driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[2]/span/input")).sendKeys(" "); //password
		driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[3]/span/input")).sendKeys(" "); // host name
		driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[4]/span/input")).sendKeys(" "); //port no
		driver.findElement(By.xpath("//*[@id='profileRadiochecked']")).click(); //enable SSL
		driver.findElement(By.xpath("//*[@id='btnprofilesubmit']")).click(); // submit
		
		Thread.sleep(8000);
		//with invalid value
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[1]/span/input")).sendKeys(" sfs sfgs@%%#%.djgldkfj ");  //email
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[2]/span/input")).sendKeys("' "); //password
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[3]/span/input")).sendKeys("&^%&^*(^ "); // host name
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[4]/span/input")).sendKeys("^&*^*^* 5364634&*^*("); //port no
				driver.findElement(By.xpath("//*[@id='profileRadiochecked']")).click(); //enable SSL
				driver.findElement(By.xpath("//*[@id='btnprofilesubmit']")).click(); // submit
				
				Thread.sleep(8000);		
				//with valid value
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[1]/span/input")).clear();
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[1]/span/input")).sendKeys("bithika@csoftindia.net");  //email
				
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[2]/span/input")).clear();
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[2]/span/input")).sendKeys("z3:Pu*A0CY"); //password
				
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[3]/span/input")).clear();
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[3]/span/input")).sendKeys("smtp01.crystone.se"); // host name
				
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[4]/span/input")).clear();
				driver.findElement(By.xpath("//*[@id='setup2']/div[2]/div/ul/li[4]/span/input")).sendKeys("587"); //port no
				driver.findElement(By.xpath("//*[@id='profileRadiochecked']")).click(); //enable SSL
				driver.findElement(By.xpath("//*[@id='btnprofilesubmit']")).click(); // submit   
		
		
		// Role
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(3000);
				driver.navigate().refresh();
				WebDriverWait role=new WebDriverWait(driver,15000);
				role.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='setupLi3']/a")));
		
		driver.findElement(By.xpath("//*[@id='setupLi3']/a")).click();
		
		String [] roletype = {"Managerrrr","TeamLeaderr","Developerr","supporterr","Testerr"};
		int k=0;
		for(int x=0;x<5;x++)
			
		{

		WebDriverWait addrole=new WebDriverWait(driver,15000);
		addrole.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='setup3']/div[2]/button")));	
		
		driver.findElement(By.xpath("//*[@id='setup3']/div[2]/button")).click();
		driver.findElement(By.id("Text4")).sendKeys(roletype[k]);
		driver.findElement(By.id("Textarea5")).sendKeys("roletype ==>"+roletype[k]);
		int j=1000;
		for(int i=0;i<33;i++)
		{
			
			driver.findElement(By.xpath("//input[@id='"+j+"']")).click();
			j++;
		}
		
		driver.findElement(By.id("btnSaveRole")).click(); 
		k++;
		
		}  **/

		
		
	// user
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebDriverWait user=new WebDriverWait(driver,15000);
		user.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='setupLi4']/a")));
		
		driver.findElement(By.xpath("//*[@id='setupLi4']/a")).click();
		
		String [] usertype = {"akash","bithika","sudipta","susmita","Tester"};
		int l=1;
		for(int x=0;x<5;x++)
			
		{
		WebDriverWait adduser=new WebDriverWait(driver,15000);
		adduser.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='setup4']/div[2]/button")));	
		driver.findElement(By.xpath("//*[@id='setup4']/div[2]/button")).click();
		
		driver.findElement(By.id("email")).sendKeys(usertype[x]);
		driver.findElement(By.id("Text46")).sendKeys("An user have been created for test purpose");
		driver.findElement(By.id("txtEmailID")).sendKeys(usertype[x]+"@csoftindia.net");
		//WebDriverWait rolelist=new WebDriverWait(driver,15000);
		//rolelist.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='rolelist']/a/span")));
		driver.findElement(By.xpath("//*[@id='rolelist']/a/span")).click();
		
		WebDriverWait rolelist=new WebDriverWait(driver,15000);
		rolelist.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='rolelist']/div/ul/li['"+l+"']/a")));
		driver.findElement(By.xpath("//*[@id='rolelist']/div/ul/li['"+l+"']/a")).click();
		
		driver.findElement(By.id("Text8")).sendKeys("123445677889");
		driver.findElement(By.id("isActiveUser")).click();
		driver.findElement(By.id("hideaddress")).click();
		driver.findElement(By.id("Text16")).sendKeys("0987654433211");
		WebDriverWait usersave=new WebDriverWait(driver,15000);
		usersave.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnSaveUser']")));
		driver.findElement(By.xpath("//button[@id='btnSaveUser']")).click();
		l++;
		
		}
		
/**	// Department
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebDriverWait department=new WebDriverWait(driver,15000);
		department.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='setupLi5']/a")));
		
		driver.findElement(By.xpath("//*[@id='setupLi5']/a")).click();
		driver.findElement(By.xpath("//*[@id='setup5']/div[2]/button")).click();
		driver.findElement(By.id("Text1")).sendKeys("Manager");
		driver.findElement(By.id("Textarea1")).sendKeys("Manager");
		driver.findElement(By.xpath("//*[@id='add-admin']/img")).click();
		driver.findElement(By.id("2")).click();
		driver.findElement(By.id("btnSubmit")).click();
		
	
	// project
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebDriverWait project=new WebDriverWait(driver,15000);
		project.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='setupLi6']/a")));
		
		driver.findElement(By.xpath("//*[@id='setupLi6']/a	")).click();
		driver.findElement(By.xpath("//*[@id='setup6']/div[2]/button")).click();
		driver.findElement(By.id("txtArchiveName")).sendKeys("Manager");
		driver.findElement(By.id("txtArchiveDes")).sendKeys("Manager");
		driver.findElement(By.xpath("//*[@id='AddARc_fromMenu']/div[2]/div/ul/li/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id='AddARc_fromMenu']/div[2]/div/ul/li/div/div/ul/li[1]/a")).click();
		driver.findElement(By.id("Buttonarc")).click();  **/
		
		
	}

}	
