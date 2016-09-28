package tests;

import java.util.concurrent.TimeUnit;

import objects.Way2smsloginpage;
import objects.Way2smsoutspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Way2smslogouttests {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://site21.way2sms.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Way2smsloginpage sigin = new Way2smsloginpage(driver);
		sigin.login("9989593467", "ramireddy");
	}
	
	@Test
	public void logout()
	{
		Way2smsoutspage logout=new Way2smsoutspage(driver);
		logout.logout();
		System.out.println("logout successfully ");
	}
	@AfterClass
	public void quit()
	{
		driver.quit();
	}

}
