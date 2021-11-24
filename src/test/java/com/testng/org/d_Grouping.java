package com.testng.org;

import org.testng.annotations.Test;

public class d_Grouping {

	@Test(groups = "player details")
	private void player_Name() {
		System.out.println("player name");

	}

	@Test(groups = "player details")
	private void player_Age() {
		System.out.println("player age");

	}

	@Test(groups = "team details")
	private void team_1() {
		System.out.println("CSK");
	}

	@Test(groups = "team details")
	private void team_2() {
		System.out.println("RCB");
	}

	@Test(groups = "location details")
	private void team1_loc() {
		System.out.println("chennai");
	}

	@Test(groups = "location details")
	private void team2_loc() {
		System.out.println("Bangalore");
	}

}
