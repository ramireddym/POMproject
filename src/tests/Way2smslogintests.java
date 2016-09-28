package tests;

import java.util.concurrent.TimeUnit;

import objects.Way2smsloginpage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Way2smslogintests {
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://site21.way2sms.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority=0)
	public void validsignIn()
	{
		Way2smsloginpage sigin = new Way2smsloginpage(driver);
		sigin.login("9989593467","ramireddy");
		driver.findElement(By.xpath("//div[contains(@class,'welcome')]"));
	}

	@Test(priority=1)
	public void InvalidsignIn()
	{
		Way2smsloginpage sigin = new Way2smsloginpage(driver);
		sigin.login("998959tttt","ramireddy");
		Alert alert=driver.switchTo().alert();
		alert.accept();

		try{
			driver.findElement(By.xpath("//div[contains(@class,'welcome')]"));

		}
		catch(NoSuchElementException e){
			System.out.println("NoSuchElement test pass");
		}
	}

	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}

