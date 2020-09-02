package feedbasepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import feedbase.baseclick;

public class page extends baseclick{
	
	public page() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='contact.html']")
	WebElement start;
	
	@FindBy(xpath="//input[@class='textbox_size']")
	WebElement tb1;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement tb2;
	
	@FindBy(xpath="//textarea[@rows='4']")
	WebElement tb3;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	
	
	public  void page1() throws InterruptedException {
		
		start.click();
		tb1.sendKeys("badri");
		Thread.sleep(5000);
		tb2.sendKeys("akashbadri98@gmail.com");
		Thread.sleep(5000);
		tb3.sendKeys("This is one of the better theaters.seating comfortabbility is good.sound quality is good");
		Thread.sleep(10000);
		submit.click();
		
		
	}
	
	

}

	

