package com.testng.org;

import org.testng.annotations.Test;

public class c_Priority {

	@Test(priority = 1 )
	private void website() {
		System.out.println("amazon");
	}

	@Test(priority = 2)
	private void category() {
		System.out.println("electronics");
	}

	@Test(priority = 3)
	private void product() {
		System.out.println("mobile");
	}

	@Test(priority = 4)
	private void cost() {
		System.out.println("30000");
	}

}
