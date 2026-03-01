package Week3.day2;

public class Edge  extends Browser{
	public void takeSnap() {
		System.out.println("Snap is taken---->Edge");
		
	}
	public void clearCookies() {
		System.out.println("Cookies are cleared--->Edge");
	}
 public static void main(String[] arg)	{	
		Edge e = new Edge();
		e.openURL();
		e.takeSnap();
		e.clearCookies();
		e.closeBrowser();
	
	}
}
