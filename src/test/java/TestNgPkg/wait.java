package TestNgPkg;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class wait {
	
	
	@Test
	public void m1() throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Selenium\\chromedriver_win32\\chromedriver.exe");
     WebDriver d1=new ChromeDriver();
     	
     	d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d1.get("https://www.google.com/");
		d1.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("mobile");
		TakesScreenshot ts=((TakesScreenshot)d1);
		 File source= ts.getScreenshotAs(OutputType.FILE);
		 File des=new File("C:\\ScrSht\\ravi.png");
		 FileUtils.copyFile(source,des);
		 
		d1.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[3]/center/input[1]")).click();
		d1.quit();
	}

}
