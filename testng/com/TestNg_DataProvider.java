package com.testng.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg_DataProvider {
	
	
	@Test(dataProvider = "data1")
	public void methodData1(String username,String password,int age) {
		System.out.println("Your Username is = " + username +" Your Password is = "+ password + "Your age is = " + age);
	}
	
	@DataProvider(name = "data1")
	public Object[][] testData() {
		return new Object[][] {
			
			{"sakthi","12345",10},{"velu","111",20},{"mas","999",30}
			
			
		};

	}

}
