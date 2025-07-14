package week2.day1;

public class Iphone 
{
	//Arguments declared inside the methods itself
	public void takeHqphoto(int photosize, String format)
	{
		System.out.println(photosize+" "+ format);
	}

	public static void main(String[] args) 
	{
		Iphone iphoneOptions = new Iphone();
		iphoneOptions.takeHqphoto(7, "jpeg");
		

	}

}
