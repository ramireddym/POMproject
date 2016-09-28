package tests;

import java.util.concurrent.TimeUnit;

import objects.Packtpubsigninpage;




import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Packtpubsignintests {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.packtpub.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority=0)
	public void validsignIn()
	{

		Packtpubsigninpage sigin = new Packtpubsigninpage(driver);
		sigin.signin("ramireddy591@gmail.com", "9666860641@3");
		driver.findElement(By.xpath(".//*[@id='account-bar-logged-in']/a[1]/div/strong"));
	}


	@Test(priority=1)
	public void InvalidsignIn()
	{

		Packtpubsigninpage sigin = new Packtpubsigninpage(driver);
		sigin.signin("ramireddy59", "9666860641@3");
		try{
			driver.findElement(By.xpath(".//*[@id='account-bar-logged-in']/a[1]/div/strong"));
			
		}
		catch(NoSuchElementException e){

		}

	}


	@AfterMethod
	public void quit()
	{	
		driver.quit();
	}

}
