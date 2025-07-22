package week3.day1;

public class chrome extends Browser
{

	public static void main(String[] args) 
	{
	Browser browserOptions=new Browser();
	browserOptions.openUrl();
	browserOptions.closeBrowser();
	browserOptions.navigateBack();
	
	}
	
	public void openIncognito()
	{
		
	}
	
	public void clearCache()
	{
		System.out.println("Clear Cache");
	}
	

}
