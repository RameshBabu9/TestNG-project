package com.testng.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized {

	@Parameters({ "username", "password" })
	@Test
	private void login_cerdentials(String username, String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh .K\\eclipse-workspace\\TestNG_Program\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		WebElement userid = driver.findElement(By.name("username"));
		userid.sendKeys(username);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(password);

	}

}
