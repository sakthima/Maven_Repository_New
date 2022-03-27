package com.testng.com;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Test;

public class TestNg_Timeout {

	@Test(timeOut = 2000)
	public void aMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("A Method");
	}

	
	@Test
	public void bMethod() {
		System.out.println("B Method");
	}

}
