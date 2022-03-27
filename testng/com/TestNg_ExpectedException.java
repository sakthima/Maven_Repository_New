package com.testng.com;

import org.testng.annotations.Test;

public class TestNg_ExpectedException {
	
	@Test(expectedExceptions =ArithmeticException.class )
	public void aMethod() {
		int a = 10/0;
		System.out.println("A Method");
	}

	
	@Test
	public void bMethod() {
		System.out.println("B Method");
	}
	
	
	@Test
	public void cMethod() {
		System.out.println("C Method");
	}

}
