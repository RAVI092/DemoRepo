package TestNgPkg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTest {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1=new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d1.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		d1.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("ravi.shekhar092@gmail.com");
		d1.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	
	Set<Cookie> l1=d1.manage().getCookies();
	System.out.println(l1.size());
	for(Cookie c1:l1)
	{
		System.out.println(c1.getName());
		System.out.println(c1.getDomain()+" "+c1.getValue());
	}
	
	Cookie co1=new Cookie("My cookie", "14545454");
d1.manage().addCookie(co1);
	d1.manage().deleteAllCookies();

System.out.println(d1.manage().getCookies().size());
//	d1.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @type='password']")).sendKeys("5742569852");
//		d1.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();
//		
	//	List<Cookies> c=
	}

}
