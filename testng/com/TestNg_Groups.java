package com.testng.com;

import org.testng.annotations.Test;

public class TestNg_Groups {
	
	@Test(groups = "smoketest1")
	public void aMethod() {
		System.out.println("A Method");
	}
	
	@Test(groups = "smoketest2")
	public void bMethod() {
		System.out.println("B Method");
	}
	
	@Test(groups = "smoketest1")
	public void cMethod() {
		System.out.println("C Method");
	}
	
	@Test(groups = {"smoketest1","smoketest2"})
	public void dMethod() {
		System.out.println("D Method");
	}

}
