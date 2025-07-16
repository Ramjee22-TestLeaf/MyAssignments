package week2.day2;

public class OddIndexToUppercase {

	public static void main(String[] args)
	{
		String test="changeme";
		char[] test1=test.toCharArray();
		for (int i = 0; i < test1.length; i++) 
		{
			if(i%2==1)
			{
					
				System.out.println(Character.toUpperCase(test1[i]));
				
			}
			else
			{
				System.out.println(test1[i]);
			}
		}
	}

}
