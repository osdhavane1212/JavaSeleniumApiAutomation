package selenium2k25;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");    

		  Thread.sleep(5000);  // Let the user actually see something!     

		  String titleofgoogle = driver.getTitle();
		  String url = driver.getCurrentUrl();
		  
		  System.out.println(url);
		  System.out.println(titleofgoogle);

		  Thread.sleep(2000);  // Let the user actually see something!     

		  driver.quit(); 
		

	}

}

