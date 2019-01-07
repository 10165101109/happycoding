package webtest;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import static org.hamcrest.CoreMatchers.equalTo;

//import org.junit.jupiter.api.Test;

class test_login {
	WebDriver driver;
	@Test
	void test_login() {
		driver = new SafariDriver();


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
