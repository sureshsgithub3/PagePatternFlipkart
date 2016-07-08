package TopMenubar;

import Menu_types.Menu_Type;
import Menus.Categiries;

public class Menubar {
	
	//Men Class
	public static class Men
	{
		public static void Select(){
			Menu_Type.Select(Categiries.Men);
		}
	 	
	}
	
	
	
	//Women Class
	public static class Women
	{
		public static void Select()
		{
			Menu_Type.Select(Categiries.Women);
		}
	}
	
	
	//Electronics class
	public static class Electronics
	{
		public static void Select()
		{
			Menu_Type.Select(Categiries.Electronics);
		}
		
	}
	
	//kids class
	
	public static  class Kids
	{
		public static void Select()
		{
			Menu_Type.Select(Categiries.Kids);
		}
		
	}
	
	
	//HOme & Furniture
	
	public static  class Home
	{
		public static void Select()
		{
			Menu_Type.Select(Categiries.Home);
		}
		
	}
	
	//Auto class
    public static class  Auto
    {
    	public static void Select(){
    		Menu_Type.Select(Categiries.Auto);
    	}
    }
    
    //books class 
    
    public static class Books
    {
    	public static void Select(){
    		Menu_Type.Select(Categiries.Books);
    	}
    	
    }
}
