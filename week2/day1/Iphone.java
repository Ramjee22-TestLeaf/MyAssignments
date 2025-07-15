package week2.day1;

public class Iphone 
{
	// int photoSize=7; If we declare the variable under the class then it is consider as Global variable
	// or class variable and we can use this any methods inside the class.
	
	//Arguments declared inside the methods itself
	public void takeHqphoto(int photosize, String format)
	{
		//int photosize=7; we can declare the variable here or declare as an argument in the method itself
		System.out.println(photosize+" "+ format);
	}

	public static void main(String[] args) 
	{
		// int photoSize=7; If we declare under main method then it is consider as local variable and we can
		// use only inside this method.
		Iphone iphoneOptions = new Iphone();
		iphoneOptions.takeHqphoto(7, "jpeg");
		iphoneOptions.takeHqphoto(10, "gif");
		

	}

}
