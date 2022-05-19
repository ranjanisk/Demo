package org.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Documents\\Workspace\\SeleniumOnline\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
WebElement btncreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		btncreate.click();
		
		Thread.sleep(5000);
  
    WebElement txtfirst = driver.findElement(By.xpath("firstname"));
	
    txtfirst.sendKeys("ranjani");
    
    WebElement txtlast = driver.findElement(By.xpath("lastname"));
    
    txtlast.sendKeys("narmatha");
		

}
}
  
	
		
		
		
		
		

		
		
	    
		
		
		
		
		
		
		
		
		
   
		
		
		

	

	


