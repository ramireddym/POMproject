package tests;

import java.util.concurrent.TimeUnit;

import objects.Packtpubregisterpage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Packtpubregistertests {
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.packtpub.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test(priority=0)
	public void validregister()
	{
		Packtpubregisterpage registe = new Packtpubregisterpage(driver);
	registe.register("ramireddy591@gmail.com", "venkataramireddy","mareddy","9666860641@3","9666860641@3");
		driver.findElement(By.xpath(".//*[@id='account-bar-logged-in']/a[2]/div"));
	}

	@Test(priority=1)
	public void Invalidregister()
	{
		Packtpubregisterpage registe = new Packtpubregisterpage(driver);
		registe.register("ramireddy591gmail.com", "venkataramireddy","mareddy","9666860641@3","9666860641@3");
		try{
			driver.findElement(By.xpath(".//*[@id='account-bar-logged-in']/a[2]/div"));

		}
		catch(NoSuchElementException e){

		}
	}
	@AfterMethod
	public void Quit()
	{	
		driver.quit();
	}

}
