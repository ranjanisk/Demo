package org.sel;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Welcome {

	 static WebDriver driver;
	public static void Screenshot(String name) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot tk =(TakesScreenshot) driver;
		
		 File src =	tk.getScreenshotAs(OutputType.FILE);
		   
		   System.out.println(src);
		   
		   
		   File desc = new File 
		("C:\\Users\\ELCOT\\Documents\\Workspace\\SeleniumOnline\\screenshot\\" +name+".png");
		   
		    FileUtils.copyFile(src, desc);
	
	}

	public static void main(String[] args) throws IOException {
		
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	   
	 driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	
	Screenshot("lanuch");
	
	WebElement txtuser =driver.findElement(By.id("email"));
	
	txtuser.sendKeys("ranjani");
	
	Screenshot("username");
	
WebElement txtpass =driver.findElement(By.name("password"));
	
	txtpass.sendKeys("ranjani@2310");
   
	Screenshot("password");

		
	   
	}
	 
}

	 
	  
	 
	
	 
	
	
	
  


		
	

	
	
		
		
		
		
		
         
 
         
       
         
		
	

	
		
	


