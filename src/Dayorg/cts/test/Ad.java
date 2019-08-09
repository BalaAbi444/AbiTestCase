package Dayorg.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ad {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		List <WebElement>fr=driver.findElements(By.tagName("iframe"));
	int	h=fr.size();
	System.out.println(h);
	
	driver.switchTo().frame("a077aa5e");
	WebElement f=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	f.click();
	driver.switchTo().defaultContent();
		
	}

}
