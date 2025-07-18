package week2.day4;

public class FibbonacciSeries {

	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int n3;
		System.out.println("Fibbonacci Series");
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<6;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			
			
		}
	}

}
