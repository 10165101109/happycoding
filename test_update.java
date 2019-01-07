package webtest;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import static org.hamcrest.CoreMatchers.equalTo;

class test_update {
	WebDriver driver;
	@Test
	void test_update() {
		driver = new SafariDriver();
		  driver.get("http://127.0.0.1:8080/Time/index.jsp");
		  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  driver.findElement(By.id("message")).click();
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  driver.quit();
	}

}
