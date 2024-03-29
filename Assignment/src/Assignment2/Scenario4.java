package Assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario4 
{
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MANISH%20SUKLA/Desktop/demo.html");
		List<WebElement> lst = driver.findElements(By.tagName("option"));
		System.out.println(lst.size());
		Object expected[]= {"Kerla", "Karnataka", "Tamilnadu", "Telangana"};
		Arrays.sort(expected);
		Object actual[]=new Object[lst.size()];
		for (int i = 0; i < lst.size(); i++)
		{
			    actual[i] = lst.get(i).getText();
				System.out.println(actual[i]);
			
		}
		
	 if (expected.equals(actual))
	{
		System.out.println("content is sorted order");
	}
	  else
	  {
			System.out.println("content is not in sorted order ");
		}
		  
		driver.close();
		
		

}

}
