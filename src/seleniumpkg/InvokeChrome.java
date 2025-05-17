package seleniumpkg;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome {

	public static void main(String[] args) {
		
		//Invoke Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\KarthiLK\\Selenium Latest Versions\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//Invoke Chrome Browser
		WebDriver driver = new ChromeDriver();
		//Maximize Browser
		driver.manage().window().maximize();
		//To delete all cookies
		driver.manage().deleteAllCookies();
		//Launch an application
		driver.get("https://support.prophoenix.com/login.aspx");
		
		
		String title = driver.getTitle();
		System.out.println("Title is : " + title);
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL is :" + currentUrl);
				
		driver.close();
		
		System.out.println("Done");

	}

}
