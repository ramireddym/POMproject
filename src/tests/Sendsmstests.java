package tests;

import java.util.concurrent.TimeUnit;

import objects.Sendsmspage;
import objects.Way2smsloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Sendsmstests {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://site21.way2sms.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Way2smsloginpage sigin = new Way2smsloginpage(driver);
		sigin.login("9989593467", "ramireddy");
	}
	@Test(priority=0)
	public void validsendsms()
	{
		Sendsmspage sms=new Sendsmspage(driver);
		sms.sendsms("9666860641","Em doing maaaa@@@@@@@@@@@@");
		driver.findElement(By.xpath("html/body/form/div[3]/div/p/span"));
	}	
	@Test(priority=1)
	public void Invalidsendsms()
	{ 
		Sendsmspage sms=new Sendsmspage(driver);
		sms.sendsms("96668641","Em doing maaaa@@@@@@@@@@@@");
		try
		{
			driver.findElement(By.xpath("html/body/form/div[3]/div/p/span"));
		}
		catch(NoSuchElementException e){
		}
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}


