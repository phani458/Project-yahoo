package webdriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_capture 

{
	WebDriver driver;
	public void screenshot(String str) throws IOException 
	{
		DateFormat df=new SimpleDateFormat("yyyy/mmm/dd hh:mm:ss");
		Date d=new Date();
		String time=df.format(d);
		System.out.println(time);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("E:\\workspace selenium\\selenium pratice\\screenshots123\\"+str+time+".png"));
	}
	public void browser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		screenshot("loginpage");	
	}
	
	public void gmaillogin() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("phanikrishnaqa");	
		screenshot("loginID");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Swetha@546");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		screenshot("Dashboard");
	}
	public void logout() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='gb_Ba gbii']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
		driver.quit();
	}
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Screenshot_capture s=new Screenshot_capture();
		s.browser();
		s.gmaillogin();
		s.logout();
	}

}
