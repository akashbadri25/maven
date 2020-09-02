package feedtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import feedbase.baseclick;
import feedbasepage.page;

public class page1test extends baseclick{
	
	public page page;
	@BeforeMethod
	
	public void browserOntest() {
		
		browserOn();
		page=new page();
		
		
	}
	
	@Test
	public void pagetest() throws InterruptedException {
		
		page.page1();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
