package webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login
{
	WebDriver driver;
	
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium softwares\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();	
	}
	
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("phanikrishnaqa");	
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Swetha@546");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}
	
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='gb_Ba gbii']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException
	{
		Gmail_login s=new Gmail_login();
		s.browser();
		s.login();
		s.logout();
		
	}


}
