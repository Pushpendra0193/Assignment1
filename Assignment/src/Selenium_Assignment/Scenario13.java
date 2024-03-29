package Selenium_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario13
{
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) throws Exception 
{
	//Open browser
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//Enter URL(bluestone)
	driver.get("https://www.bluestone.com/");
	  //click on goldmine 10+1 Scheme
	driver.findElement(By.xpath("//div[@class='gms-banner-inner']/strong[.='10 + 1']")).click();	
	//enter  monthly amount and email address and click on start now
	WebElement amt = driver.findElement(By.xpath("//input[@id='amount']"));
	amt.sendKeys("5000");
	amt.sendKeys(Keys.ENTER);
	WebElement email = driver.findElement(By.xpath("//input[@id='Email' and @name='email']"));
	email.sendKeys("sagar234@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='tahLpSubmit']")).click();
	Thread.sleep(1000);
	//verify wheather monthly amount and email address entered is reflected in this page
	WebElement verifyemail = driver.findElement(By.xpath("//input[@id='email']"));
	Assert.assertTrue(verifyemail.isDisplayed(), "email is not displayed");
	WebElement verifyamt = driver.findElement(By.xpath("//span[@name='subscriptionAmount']"));
	Assert.assertTrue(verifyamt.isDisplayed(), "amount is not displayed");
	//close browser
	driver.close();
	
     }

}
