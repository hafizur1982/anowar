package test;

import org.testng.annotations.Test;

import testBase.BaseChrome;

public class Google extends BaseChrome {
	
	@Test
	public void openGoogle() {
		
		driver.get("http://google.com");
	}

}
