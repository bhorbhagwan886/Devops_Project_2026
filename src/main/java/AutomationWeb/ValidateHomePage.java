package AutomationWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ValidateHomePage {
	@Test
	public void test() throws InterruptedException {
		
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
	 String homeURL = driver.getCurrentUrl();
	 System.out.println(homeURL);
		 if(homeURL.equals("https://www.saucedemo.com/inventory.html")) {
		 System.out.println("TC Passed");
	 }else {
		 
		 System.out.println("TC failed");
	 }
	 
	 Thread.sleep(3000);
	 driver.findElement(By.id("react-burger-menu-btn")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.id("about_sidebar_link")).click();
	 String aboutURL = driver.getCurrentUrl();
	 
	 if(aboutURL.equals("https://saucelabs.com/")) {
		 System.out.println("passed TC ...!");
	 }else
	 {
		 System.out.println("TC failed..!");
	 }
	
	driver.close();
	}
}
