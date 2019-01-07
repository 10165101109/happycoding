package webtest;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class test_firefox_incorrect_login_with_incorrect_password {

	@Test
	void test_firefox_incorrect_login_with_incorrect_password() {
		System.setProperty("webdriver.firefox.marionette","/Applications/Firefox.app/Contents/MacOS/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://127.0.0.1:8080/Time/login.jsp"); //指定浏览器跳转的Url；
		driver.findElement(By.name("telephone")).sendKeys("13979001342");


		  driver.findElement(By.name("password")).sendKeys("2");


		  driver.findElement(By.className("login")).click();


		 // assertThat(driver.getTitle(),equalTo(""));


		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		 // driver.quit();


		  try {


				Thread.sleep(3000);


			} catch (InterruptedException e) {


				// TODO Auto-generated catch block


				e.printStackTrace();


			}


		  driver.quit();
	}

}
