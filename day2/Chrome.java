package Week3.day2;

public class Chrome  extends Browser{

	public void openIncognito() {
		System.out.println("Incognito is opened-->Chrome");
		
	}

		
	
	public void clearCache() {
		System.out.println("Cache is cleared--->Chrome");
	
	}


	
   public static void main(String[] arg){
		
		Chrome c = new Chrome();
		c.openURL();
		c.openIncognito();
		c.clearCache();
		c.closeBrowser();
	
   }
}

