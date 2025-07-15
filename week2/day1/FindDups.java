package week2.day1;

import java.util.Arrays;
import java.util.Iterator;

public class FindDups {

	public static void main(String[] args)
	{
		int numbers[]= {2,5,7,7,9,2,3};
		Arrays.sort(numbers);
		System.out.println("Sorted Values are"+ " "+Arrays.toString(numbers));
		for (int i = 0; i < numbers.length-1; i++) 
		{
			if(numbers[i]==numbers[i+1])
			{
				System.out.println("Duplicate values are"+" " +numbers[i]);
			}
		}
		

	}

}
