package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {

	@Test
	public void testcase1()
	
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	driver.findElementById("lst-ib").sendKeys("Hello");
	driver.findElementByName("btnK").sendKeys("hello");
}
}
