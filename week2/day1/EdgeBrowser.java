package week2.day1;

public class EdgeBrowser 
{


	public static void main(String[] args) 
	{
		Browser p1 = new Browser();
		String s = p1.launchBrowser("Chrome");
		System.out.println(s);
		p1.loadUrl();
		

	}

}
