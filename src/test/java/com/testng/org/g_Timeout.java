package com.testng.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class g_Timeout {

	WebDriver driver;

	@Test(timeOut = 10000)
	private void facebook() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh .K\\eclipse-workspace\\TestNG_Program\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
