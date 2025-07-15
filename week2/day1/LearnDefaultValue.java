package week2.day1;

public class LearnDefaultValue 
{
	public void method1(int num,String name,boolean status)
	{
		
	}

	public static void main(String[] args) 
	{
		LearnDefaultValue objname=new LearnDefaultValue();
		objname.method1(0, null, false); //if we are not assigning any value then by default it returns 
		//0 for int , null for string and false for boolean.

	}

}
