package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sendsmspage {
	WebDriver driver;
	
	public Sendsmspage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void sendsms(String mobilenumber, String text)
	{
		driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath(".//a[text()='Send SMS']")).click();
		driver.switchTo().frame("frame");
		driver.findElement(By.id("mobile")).sendKeys(mobilenumber);
		driver.findElement(By.id("message")).sendKeys(text);
		driver.findElement(By.id("Send")).click();
	}
}
