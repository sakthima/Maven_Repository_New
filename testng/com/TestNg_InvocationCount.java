package com.testng.com;

import org.testng.annotations.Test;

public class TestNg_InvocationCount {

	
	@Test(invocationCount = 5)
	public void aMethod() {
		System.out.println("1 Method");
	}
	
	@Test
	public void bMethod() {
		System.out.println("2 Method");
	}
	
	
	@Test(invocationCount = 5)
	public void cMethod() {
		System.out.println("3 Method");
	}
}
