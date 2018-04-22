package Package1;

import org.testng.annotations.Test;

public class CodeExecution extends Webdriver {

	Locators a = new Locators();
	Values b = new Values();
	
	@Test
	public void helloWOrld(){
		
		xy(a.emailX,b.Email);
		
		
	}
	
	
}
