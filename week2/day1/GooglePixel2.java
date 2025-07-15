package week2.day1;

public class GooglePixel2 
{
	public int sendMessage() 
	{
		int number=6;
		return number;
	}
	public String phototype()
	{
		return "jpeg";
	}
	
	public static void main(String[] args) 
	{
		GooglePixel2 pixelOptions=new GooglePixel2();
		int sendMessage = pixelOptions.sendMessage();
		String photoname = pixelOptions.phototype();
		//System.out.println(sendMessage);
		System.out.println(pixelOptions.sendMessage());
		System.out.println(photoname);
		
	}
	
}
