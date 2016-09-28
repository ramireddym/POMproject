package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Packtpubsigninpage {
	
	WebDriver driver;

	public Packtpubsigninpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void signin(String username,String password)
	{
		driver.findElement(By.xpath(".//*[@id='account-bar-login-register']/a[1]/div")).click();
		driver.findElement(By.xpath("//form[not(contains(@style,'none'))]//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//form[not(contains(@style,'none'))]//input[@id='password']")).sendKeys(password);
/*		driver.findElement(By.id("five-dollar-search-keys")).sendKeys(five);*/
		driver.findElement(By.xpath("//form[not(contains(@style,'none'))]//input[@id='edit-submit-1']")).click();


	}


}
