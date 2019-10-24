package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_login 
{
	WebDriver driver;
	
	public void browser() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	}
	
	public void login()
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}
	
	public void logout()
	{
		driver.findElement(By.className("panelTrigger")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
	}
	public static void main(String[] args)
	{
		Orangehrm_login s=new Orangehrm_login();
		s.browser();
		s.login();
		s.logout();

	}

}
