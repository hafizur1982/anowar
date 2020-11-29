package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseChrome {

	public WebDriver driver;
	
    @Test
	public void openCrome() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//hafiz//eclipse-hafiz//www//src//main//resources//drivers//chromedriver_win32 (1)//chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
