package com.testng.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class f_invocation {

	WebDriver driver;

	@BeforeSuite
	private void browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh .K\\eclipse-workspace\\TestNG_Program\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Test(invocationCount = 5)
	private void amazon() {
		driver.get("https://www.amazon.in/");
	}

}
