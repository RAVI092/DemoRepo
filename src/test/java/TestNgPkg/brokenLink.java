package TestNgPkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLink {
	
static void m1(String uni) throws IOException
{
	URL u=new URL(uni);
	HttpURLConnection hc=(HttpURLConnection)u.openConnection();
//	hc.setConnectTimeout(3000);
	hc.connect();
	
	if(hc.getResponseCode()==200)
	{
		System.out.println("vhh"+hc.getResponseMessage());
	}
	if(hc.getResponseCode()==402)
	{
		System.out.println("ghg"+hc.getResponseMessage());
	}
}
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1=new ChromeDriver();
		
		d1.get("https://www.flipkart.com/");
int x=d1.findElements(By.tagName("a")).size();		
System.out.println(x);
for(int e=0;e<=x;e++)
{
String y=d1.findElements(By.tagName("a")).get(e).getAttribute("href");
String b=d1.findElements(By.tagName("a")).get(e).getText();
System.out.println(b);
System.out.println(y);
m1(y);
}

	}

}
