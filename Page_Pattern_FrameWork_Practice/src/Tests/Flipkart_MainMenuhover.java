package Tests;





import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Browsers.Browser;
import Homepages.Flipkartpage;
import TopMenubar.Menubar;

public class Flipkart_MainMenuhover {
	
	
	@Before
	public void Open(){
		Browser.open();
	}
	
	@After
	public void Close(){
		Browser.close();
		
	}
	
	
	@Test
	public void Flipkart_Menuhovers() throws Exception{
		Flipkartpage.Goto();
		//Assert.assertTrue(Flipkartpage.Isat());
		Menubar.Electronics.Select();
		Thread.sleep(2000);
		Menubar.Men.Select();
		Thread.sleep(2000);
		Menubar.Women.Select();
		Thread.sleep(2000);
		Menubar.Kids.Select();
		Thread.sleep(2000);
		
		Menubar.Home.Select();
		Thread.sleep(2000);
		Menubar.Books.Select();
		Thread.sleep(2000);
		Menubar.Auto.Select();
		
		
		
		
	}
	

}
