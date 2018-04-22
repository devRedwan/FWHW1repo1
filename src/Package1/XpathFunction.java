package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathFunction {

	public WebDriver driver;
	
	public void xy (String x, String y){
		driver.findElement(By.xpath(x)).sendKeys(y);
		
		
	}
	
	
}
