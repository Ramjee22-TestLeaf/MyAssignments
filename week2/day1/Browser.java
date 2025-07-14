package week2.day1;

public class Browser 
{
public String launchBrowser(String browserName)
{
	System.out.println("Browser Launched Successfully");
	return browserName;
}
public void loadUrl()
{
	System.out.println("Application URL loaded Successfully");
}

	public static void main(String[] args)
	{
		Browser status = new Browser();	
		String s = status.launchBrowser("Chrome");
		System.out.println(s);
		status.loadUrl();
		

	}

}
