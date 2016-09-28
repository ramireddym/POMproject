package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Way2smsloginpage {
	WebDriver driver;
	
	public Way2smsloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void login(String phonenumber,String password)
	{
		driver.findElement(By.id("username")).sendKeys(phonenumber);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginBTN")).click();
		
	}
	

}
