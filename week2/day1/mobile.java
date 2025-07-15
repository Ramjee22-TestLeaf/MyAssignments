package week2.day1;

public class mobile 
{
    public void makeCall()  //method
    {
    	System.out.println("Make call");
    }
    public void takePhoto() 
    {
    	System.out.println("Take photo");

	}
	public static void main(String[] args) 
	{
		//classname object = new classname() syntax to create object
		mobile mobileOptions=new mobile();
		//mobile camera=new mobile();
		mobileOptions.makeCall();
		mobileOptions.takePhoto();
		

	}

}
