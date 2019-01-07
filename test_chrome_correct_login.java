package webtest;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class test_chrome_correct_login {

	@Test
	void test_chrome_correct_login() {
		System.setProperty("webdriver.chrome.driver", "/Users/feiyanhong/eclipse-workspace/webtest/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://127.0.0.1:8080/Time/login.jsp");


		  driver.findElement(By.name("telephone")).sendKeys("13979001342");


		  driver.findElement(By.name("password")).sendKeys("1");


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
