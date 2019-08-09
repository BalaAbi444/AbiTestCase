package org.cts.test;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Client {
	static WebDriver driver;
	static Actions acc;
	@BeforeClass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
//@AfterClass
//public static void quitBrowser() {
//	driver.quit();
//}
@Before
public void startTime() {
	Date d=new Date();
	System.out.println(d);
}
@After
public void endTime() {
	Date d=new Date();
	System.out.println(d);
}
@Test
public void logica() throws AWTException {
	WebElement u=driver.findElement(By.id("email"));
	u.sendKeys("563789");
	acc=new Actions(driver);
	acc.doubleClick(u).perform();
	acc.contextClick(u).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement p=driver.findElement(By.id("pass"));
	p.click();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
}
}

