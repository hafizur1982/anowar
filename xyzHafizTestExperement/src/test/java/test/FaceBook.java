package test;

import org.testng.annotations.Test;

import testBase.BaseChrome;

public class FaceBook extends BaseChrome{
	
	@Test
	public void opengoogle() {
		driver.get("http://facebook.com");
	}

}
