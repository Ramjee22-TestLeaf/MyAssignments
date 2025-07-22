package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class IntersectionUsingList 
{
	

	public static void main(String[] args) 
	{
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		int array1[]= {3,2,11,4,6,7};
		int array2[]= {1,2,8,4,9,7};
		for(int num1:array1)
		{
			list1.add(num1);
		}
		for(int num2:array2)
		{
			list2.add(num2);
		}
		System.out.println("Values in List1:"+" " +list1);
	    System.out.println("Values in List2:"+" " +list2);
	    System.out.println("List1 Size=" +list1.size()+" and " +"List2 Size=" +list2.size());
	    for(int i=0;i<list1.size();i++)
	    {
	    	if(list1.contains(list2.get(i)))
	    			{
	    		      System.out.println("list1 and list2 matched values are "+ +list2.get(i));
	    			}
	    		
	    }
	    }
	}

	

