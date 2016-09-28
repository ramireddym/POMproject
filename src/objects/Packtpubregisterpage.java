package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Packtpubregisterpage {

	WebDriver driver;

	public Packtpubregisterpage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void register(String emailaddress,String firstname,String lastname,String password,String confirmpassword)

	{
		driver.findElement(By.xpath(".//*[@id='account-bar-login-register']/a[2]/div")).click();	
		driver.findElement(By.id("edit-email-address")).sendKeys(emailaddress);
		driver.findElement(By.id("edit-first-name")).sendKeys(firstname);
		driver.findElement(By.id("edit-last-name")).sendKeys(lastname);
		/*drivewr.findElement(By.xpath(".//*[@id='tech_preferences_chosen']/ul")).sendKeys("techpreferences");*/
		driver.findElement(By.id("edit-pass")).sendKeys(password);
		driver.findElement(By.id("edit-confirm-password")).sendKeys(confirmpassword);
		driver.findElement(By.xpath("//div[contains(@class,'recaptcha')]")).click();
		driver.findElement(By.id("edit-register")).click();
	}

}
