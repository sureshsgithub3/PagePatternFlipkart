package Homepages;


import Browsers.Browser;

public class Flipkartpage {
	
	
	public static String baseurl="http://www.flipkart.com/";
	public static String title="Online Shopping India Mobile, Cameras, Lifestyle more Online @ Flipkart.com";
	
	
	public static void Goto(){
		Browser.Driver().get(baseurl);
	}
	
	public static boolean Isat(){
		return Browser.Driver().getTitle().contains(title);
		
	}
	

}
