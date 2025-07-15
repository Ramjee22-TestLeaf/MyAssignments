package week2.day1;

import java.util.Arrays;

public class LearnArrays 
{
//used to store multiple values in a single variable with same data type.
	//memory location is called as Index in arrays
	//Index starts with 0
	
	public static void main(String[] args) 
	{
		int score[]= {100,90,80,70,60};
		int lengthofarray = score.length;
		System.out.println("Length of Array"+ lengthofarray);

		//Retrieve value using index
		System.out.println(score[4]);
		
		//Retrieve all the data's
		for (int i = 0; i < score.length; i++) 
		{
			System.out.println(score[i]);
		}
		
		//To arrange ascending order use -SORT
		Arrays.sort(score);
		System.out.println("Lowest value :" + score[0]);
		
		//To get the highest number (length-1)
		System.out.println("Highest value :" + score[lengthofarray-1]);
		for (int i = lengthofarray-1; i >=0; i--) 
		{
			System.out.println(score[i]);
		}
		
		//Array Instatiation and creating object both are same
		
		String name[]=new String[3];
		name[0]="Ram";
		name[1]="jee";
		name[2]="nagarajan";
		System.out.println(name[0]);
		
		
		
		
	}

}
