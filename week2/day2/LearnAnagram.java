package week2.day2;

import java.util.Arrays;

public class LearnAnagram {

	public static void main(String[] args) 
	{
		String name1="stops";
		String name2="potss";
		int name1length = name1.length();
		int name2length = name2.length();
		if(name1length!=name2length)
		{
			System.out.println("Lengths mismatch,therefore the strings are not an Anagram");
			return;
		}
		char[] n1=name1.toCharArray();
		char[] n2=name2.toCharArray();
		Arrays.sort(n1);
		Arrays.sort(n2);
		System.out.println(n1);
		System.out.println(n2);
		if (Arrays.equals(n1, n2))
		{
			System.out.println("The given strings are Anagram");
		} 
		else 
		{
          System.out.println("The given strings are not Anagram");
		}
		

	}

}
