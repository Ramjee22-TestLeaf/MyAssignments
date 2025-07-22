package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber 
{

	public static void main(String[] args) 
	{
		List<Integer> Largenumber=new ArrayList<>();
		int numbers[]= {3,2,11,4,6,7};
		for(int list:numbers)
		{
			Largenumber.add(list);
		}
		System.out.println("Values in List2:"+" " +Largenumber);
		Collections.sort(Largenumber);
		System.out.println("Ascending order:"+" "+Largenumber);
		int SecondLargest=Largenumber.get(Largenumber.size()-2);
		System.out.println("Second Largest Number is :"+"  "+SecondLargest);
		
		

	}

}
