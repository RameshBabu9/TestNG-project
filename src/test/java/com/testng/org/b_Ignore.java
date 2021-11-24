package com.testng.org;

import org.testng.annotations.Test;

public class b_Ignore {

	@Test
	private void amazon() {
		System.out.println("amazon launch");
	}

	@Test(enabled = false )
	private void filpkart() {
		System.out.println("flipkart launch");
	}

	@Test
	private void snapdeal() {
		System.out.println("snpadeal launch");
	}

	@org.testng.annotations.Ignore
	@Test
	private void myntra() {
		System.out.println("myntra launch");
	}

	@Test
	private void max() {
		System.out.println("max launch");
	}

}
