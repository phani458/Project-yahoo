package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login 
{
	WebDriver driver;
	
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	public void login() 
	{
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("phani458");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Swetha@546");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	
	public static void main(String[] args) 
	{
		Facebook_login s=new Facebook_login();
		s.browser();
		s.login();

	}

}
