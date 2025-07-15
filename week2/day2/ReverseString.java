package week2.day2;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) 
	{
		       
        String CompanyName = "TestLeaf";
		char[] name=CompanyName.toCharArray();
		System.out.println(name);
		int lenghtOfString = CompanyName.length();
		System.out.println(lenghtOfString);
		System.out.println("Reversed String: ");
		for (int i =lenghtOfString-1 ; i >=0; i--) 
		{
			System.out.println(name[i]);
		}

	}

}
