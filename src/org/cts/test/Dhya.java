package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dhya {
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
	Thread.sleep(4000);
	
	c.selectByVisibleText("Chennai");
	c.selectByIndex(8);
	List<WebElement> v=c.getOptions();

		for(int i=0;i<v.size();i++) {
		WebElement k=v.get(i);
		String gh=k.getText();
		System.out.println(gh);
		
		
	}
		List<WebElement> v1=c.getOptions();
	for(int i=0;i<v.size();i++) {
		WebElement k1=v1.get(i);
	String	value=k1.getAttribute("value");
	System.out.println(value);
		
	}
	
	}
}
	


