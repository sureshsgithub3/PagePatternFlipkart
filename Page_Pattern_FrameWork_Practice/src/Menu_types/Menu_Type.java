package Menu_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browsers.Browser;
import MenuSelectors.Categiries_Selectors;
import Menus.Categiries;

public class Menu_Type {
	
	public static WebElement  Waitforelement(By locator,int seconds)
	{
		return (new WebDriverWait(Browser.Driver(),seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	public static void Select(Categiries Topmenu){
		switch (Topmenu) {
		case Men:
			Actions Menaction =new Actions(Browser.Driver());
			Menaction.moveToElement(Waitforelement(By.xpath(Categiries_Selectors.Men_xpath),2000)).build().perform();
			
			break;
		case Women:
			Actions Womenaction=new Actions(Browser.Driver());
			Womenaction.moveToElement( Waitforelement(By.xpath(Categiries_Selectors.Women_Xpath),2000)).build().perform();
             break;
		case Electronics:
			Actions Elec_action=new Actions(Browser.Driver());
			Elec_action.moveToElement(Waitforelement(By.xpath(Categiries_Selectors.Electronics_xpath), 2000)).build().perform();
		    break;
		    
		case Home:
			Actions Home_actions=new Actions(Browser.Driver());
			Home_actions.moveToElement(Waitforelement(By.xpath(Categiries_Selectors.Home_xpath), 2000)).build().perform();
			break;
		case Kids:
			Actions Kidsaction=new Actions(Browser.Driver());
			Kidsaction.moveToElement(Waitforelement(By.xpath(Categiries_Selectors.kids_xpath), 2000)).build().perform();
			break;
		case Books:
			Actions Bookactions=new Actions(Browser.Driver());
			Bookactions.moveToElement(Waitforelement(By.xpath(Categiries_Selectors.Books_xpath), 2000)).build().perform();
		case Auto:
			Actions Autoactions= new Actions(Browser.Driver());
			Autoactions.moveToElement(Waitforelement(By.xpath(Categiries_Selectors.Auto_xpath), 2000)).build().perform();
			
			
			default:
			break;
		}
	}

}
