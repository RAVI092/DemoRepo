package TestNgPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locators {
	
	
	
	@Test
	public void loc()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravi\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://phptravels.com/demo/");
		d1.findElement(By.id("wh-widget-send-button-wrapper")).click();
	}

}
