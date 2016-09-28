package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Way2smsoutspage 
{
	WebDriver driver;

	public Way2smsoutspage(WebDriver driver)
	{
		this.driver=driver;	
	}
	public void logout()
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
