package TestNgPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parrelel_Execution {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.navigate().to("https://www.google.com/");
		
		
		
  }
  
  @Test
  public void f1()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d2=new ChromeDriver();
		d2.navigate().to("https://www.facebook.com/");
	  
  }
}
