package Dayorg.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		WebElement a=driver.findElement(By.xpath("//span[text()='HOME'][1]"));
		WebElement b=driver.findElement(By.xpath("//div[text()='Share this page']"));
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)",a);
		j.executeScript("arguments[0].scrollIntoView(false)",b);
	}
	

}
