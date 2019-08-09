import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tspsc.gov.in/TSPSCOTR2015/oneTimeRegistration.tspsc");
		WebElement F=driver.findElement(By.id("community"));
		Select s=new Select(F);
		boolean g=s.isMultiple();
		
		List<WebElement> k=s.getOptions();
		int size=k.size();
		System.out.println(size);
		
		s.selectByValue("3");
		
		s.selectByVisibleText("BC-B");
		
		List<WebElement> k1=s.getOptions();
		for(int i=0;i<k1.size();i++) {
			WebElement a=k1.get(i);
			
			String text=a.getText();
			System.out.println(text);
			
		}
		
		List<WebElement> k2=s.getOptions();
		for(WebElement x:k2) {
			System.out.println(x.getAttribute("value"));
		}
	
	}
	

}
