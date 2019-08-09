package Dayorg.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement d=driver.findElement(By.id("dcdrLocation"));
		Select c =new Select(d);
	boolean	m=c.isMultiple();
	System.out.println(m);
	List<WebElement> li=c.getOptions();
	int text=li.size();
	System.out.println(text);
	
	
	c.selectByVisibleText("Chennai");
	c.selectByIndex(8);
	WebElement f=driver.findElement(By.id("givenName"));
	f.sendKeys("Abi");
	
	
	WebElement f1=driver.findElement(By.id("dob"));
	f1.sendKeys(" 10/11/1993");
	Thread.sleep(4000);
	
	WebElement f2=driver.findElement(By.id("emailloginSameyes"));
	f2.click();
	
	
	
	
	
	
	
	
	
	}

}
