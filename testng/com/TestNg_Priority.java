package com.testng.com;

import org.testng.annotations.Test;

public class TestNg_Priority {
	
	@Test(priority = -5)
	public void aMethod() {
		System.out.println("A Method");
	}
	
	@Test(priority = 1)
	public void bMethod() {
		System.out.println("B Method");
	}
	
	@Test(priority = 2)
	public void cMethod() {
		System.out.println("C Method");
	}
	
	@Test(priority = -3)
	public void dMethod() {
		System.out.println("D Method");
	}
	
	@Test
	public void eMethod() {
		System.out.println("E Method");
	}
	

}
