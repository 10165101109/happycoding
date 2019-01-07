package webtest;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class test_firefox_only_load_more {

	@Test
	void test_firefox_only_load_more() {
		System.setProperty("webdriver.firefox.marionette","/Applications/Firefox.app/Contents/MacOS/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1:8080/Time/index.jsp");
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		 
		  executor.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.name("load_more")));
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.findElement(By.name("load_more")).click();
		 // if(driver.findElement(By.name("load_more")) != null) 
			//  System.out.println("hello");
		  //driver.quit();
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  driver.quit();
	}

}
