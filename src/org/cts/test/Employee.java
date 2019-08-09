package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Employee {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions acc=new Actions(driver);
		
		WebElement enter=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		enter.click();
		WebElement a=driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[4]"));
		 
		acc.moveToElement(a).perform();
		WebElement b=driver.findElement(By.xpath("(//a[@title='Footwear'])[2]"));
		b.click();
	
}
}
