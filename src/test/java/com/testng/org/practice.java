package com.testng.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice {

	WebDriver driver;

	@BeforeSuite
	private void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh .K\\eclipse-workspace\\TestNG_Program\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@BeforeTest
	private void browser_launch() {
		driver.get("https://www.facebook.com/");

	}

	@Test
	private void login() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("ramesh");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}

}
