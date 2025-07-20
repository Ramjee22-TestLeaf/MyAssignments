package week2.day4;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		 int number = 121;
		 int number2 = 12345;
	        int reversed = 0;
	        int reversed2 = 0;
	        for (number=121;number != 0; number =number/ 10)
	        {
	            int digit = number % 10;
	            reversed = reversed*10 +digit;
	            
	        }

	        System.out.println("Reversed number: " + reversed);
	        if(reversed==number)
	        {
	        	System.out.println("The given number is Palindrome");
	        }
	        else
	        {
	        	System.out.println("The given number is Palindrome");
	        }

	}

}
