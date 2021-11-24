package com.testng.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized2 {
	@Parameters({ "username", "password" })
	@Test
	private void login_cerdentials(String username, String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh .K\\eclipse-workspace\\TestNG_Program\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userid = driver.findElement(By.name("email"));
		userid.sendKeys(username);
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys(password);

	}

}
