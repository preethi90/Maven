package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");				
	}
	
	public static WebDriver driver = new ChromeDriver();
	

}
