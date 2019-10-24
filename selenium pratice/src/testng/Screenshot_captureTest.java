package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Screenshot_captureTest {
	WebDriver driver;
	
  @Test
  public void screenshot() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://accounts.google.com/");
	  driver.manage().window().maximize();
  }

}
