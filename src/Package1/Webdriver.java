package Package1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Webdriver extends XpathFunction {

	@BeforeTest
	public void drivers(){

		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");


	}

}
