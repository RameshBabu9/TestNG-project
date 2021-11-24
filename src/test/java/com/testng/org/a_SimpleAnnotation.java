package com.testng.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a_SimpleAnnotation {

	@BeforeSuite
	private void setUp() {
		System.out.println("Setup");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser");
	}

	@BeforeClass
	private void url() {
		System.out.println("amazon url");
	}

	@BeforeMethod
	private void login() {
		System.out.println("login");
	}

	@Test
	private void mobile() {
		System.out.println("Mobile Search");
	}

	@Test
	private void laptop() {
		System.out.println("laptop search");
	}

	@AfterMethod
	private void verify() {
		System.out.println("verify home page");
	}

	@AfterClass
	private void logout() {
		System.out.println("logout");
	}

	@AfterTest
	private void browserclose() {
		System.out.println("browser close");
	}

	@AfterSuite
	private void deletecookies() {
		System.out.println("Delete cookies");
	}

}
