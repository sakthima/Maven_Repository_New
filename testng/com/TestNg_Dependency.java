package com.testng.com;

import org.testng.annotations.Test;

public class TestNg_Dependency {
	
	@Test
	public void aMethod() {
		System.out.println("A Method");
	}
	
	@Test(dependsOnMethods = {"cMethod","dMethod"})
	public void bMethod() {
        System.out.println("B Method");
	}
	
	@Test
	public void cMethod() {
        System.out.println("C Method");
	}
	
	@Test(dependsOnMethods = "aMethod")
	public void dMethod() {
		System.out.println("D Method");
	}

}
