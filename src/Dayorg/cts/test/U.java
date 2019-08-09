package Dayorg.cts.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement search=driver.findElement(By.id("inputValEnter"));
		search.sendKeys("iphonex");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

WebElement f=driver.findElement(By.xpath("//p[text()='iPhone X Plain Cases Spectacular Ace - Black']"));
String par=driver.getWindowHandle();
System.out.println(par);
Set<String> allWindowsId=driver.getWindowHandles();
System.out.println(allWindowsId);
for(String x:allWindowsId) {

if(!par.equals(x)) {
	driver.switchTo().window(x);
}
}

WebElement f1=driver.findElement(By.xpath("//p[text()='iPhone X Plain Cases Spectacular Ace - Black']"));
f1.click();

driver.switchTo().defaultContent();
Set<String> all=driver.getWindowHandles();
List<String> li=new ArrayList<>();
li.addAll(all);
String s=li.get(1);
System.out.println(s);
driver.switchTo().window(s);
Thread.sleep(4000);
driver.switchTo().defaultContent();


	}

}
