package testng;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GmailTest 
{
	WebDriver driver;
			
	@Test
	public void login() 
	{
		
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() 
	{
		
	}

}
