import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class G {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		int h=frame.size();
		System.out.println(h);
		driver.switchTo().frame("_mN_main_224278574_0_n");
		
		
	}

}
