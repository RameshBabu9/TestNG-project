package com.testng.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class h_ExceptionTest {

	WebDriver driver;

	@Test(expectedExceptions = WebDriverException.class)
	private void insta() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh .K\\eclipse-workspace\\TestNG_Program\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.om/");
	}
}
