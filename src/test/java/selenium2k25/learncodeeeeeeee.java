package selenium2k25;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class learncodeeeeeeee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		{
			// Set Chrome options
	       // ChromeOptions options = new ChromeOptions();
//	        options.addArguments("--headless"); 
			System.setProperty("wdm.cachePath", "D:\\webdriver_cache");

	        // Setup ChromeDriver
	        WebDriverManager.chromedriver().setup();  // Automatically picks correct driver
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println("Title: " + driver.getTitle());
	        Thread.sleep(3000);
	        System.out.println("Current URl is: " + driver.getCurrentUrl());
	        driver.quit();
	        
	        
	    }


	}

}
