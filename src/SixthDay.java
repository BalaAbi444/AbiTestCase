import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixthDay {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement p=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			p.sendKeys("iphone7");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	List<WebElement> li=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	int s=li.size();
	System.out.println(s);
		
	for(int i=0;i<li.size();i++) {
	
		WebElement b= li.get(i);
		String text=b.getText();
		System.out.println(text);
		
	}
}
}
