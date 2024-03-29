package Assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception 
	{
//Open a browser of your choice say Mozilla Firefox using Gecko Driver
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//Navigate to Gmail (https://www.gmail.com)
		driver.get("https://www.gmail.com");
//	Login to your Gmail with correct credentials.
		WebElement username = driver.switchTo().activeElement();
		username.sendKeys("xyz");
		username.sendKeys(Keys.ENTER);
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("123");
		pwd.sendKeys(Keys.ENTER);
//Verify that by default “Primary” section is selected.
	    WebElement primary = driver.findElement(By.xpath("//div[@class='aKz' and contains(.,'Primary')]"));
	                    if (primary.isSelected())
	                    {
	                    	System.out.println("primary is selected ");
						}
//If not click on the Primary tab.
	                    else
	                    {
	                    	System.out.println("primary is not selected ");
	                    	primary.click();
						}
	                    
                  Thread.sleep(1000);
//Get the count of the total number of emails in the Primary tab.
	                  WebElement we1 = driver.findElement(By.xpath("//div[@id=':js']/child::span/child::span[@class='ts']"));
	                 String str = we1.getText();
	                 int count=Integer.parseInt(str);
	                 System.out.println(count);
//Get the name of the sender and subject of Nth Email of your inbox.
	                 
	                WebElement we2 = driver.findElement(By.xpath("//div/table[@id=':2r']//tbody/tr [@id=':ph']//td[@class='yX xY ']"
	                 		+ "/div[@id=':oo']/following-sibling::div[@id=':oc']/span/span[contains(.,'Maxlife Insurance')]"));
	                Thread.sleep(1000);
	                String sender = we2.getText();
	               System.out.println(sender);
	             WebElement we3 = driver.findElement(By.xpath("//div/table[@id=':2r']//tbody/tr [@id=':ph']//td[@id=':ob']//span[@id=':pw']"
	               		+ "/span[contains(.,'Save Tax & Secure Your Family With A Single Plan')]"));
	             Thread.sleep(1000);
	             String subject = we3.getText();
	               System.out.println(subject);

		
	}
	//8.	Write a method to get the name of the sender and subject of email of your in-box.
	public static String[] getSenderAndSubject(WebDriver driver,By[] ob)
	{
		 String value []= new String[ob.length];
		for (int i = 0; i < ob.length; i++) 
		{
			WebElement we4 = driver.findElement(ob[i]);
			value [i]= we4.getText();
		}
		return value;
	}
}
