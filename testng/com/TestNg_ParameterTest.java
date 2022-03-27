package com.testng.com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_ParameterTest {
	
	@Parameters("username")
	@Test
	public void methodData1(@Optional("velu")String username) {
		System.out.println("Your Username is = "+username);
	}
	
	@Parameters("password")
	@Test
	public void methodData2(String password) {
		System.out.println("Your Password is = "+password);
	}
	
	@Parameters("age")
	@Test
	public void methodData3(int age) {
		System.out.println("Your Age is = "+age);
	}

}
