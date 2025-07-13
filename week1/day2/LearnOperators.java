package week1.day2;

public class LearnOperators {

	public static void main(String[] args) 
	{
	byte a=5; //(Assignment Operator)
	byte b=3;
	int c=2;
	int d=7;
	int e=2;
	//Arithmetic Operator
	System.out.println("Arithmetic Operator");
    System.out.println(b+c);
    System.out.println(b-c);
    System.out.println(b*c);
    System.out.println(d/e); //(To get Quotient alone use '/')
    System.out.println(d%e); //(To get Reminder alone use '%')
    System.out.println("---------------------------");
    //Comparison operator (True/False)
    int i=7;
    int j=8;
    System.out.println("Comparison Operator");
    System.out.println(i==j);
    System.out.println(i!=j);
    System.out.println(i<j);
    System.out.println(i>j);
    System.out.println("---------------------------");
    int p=5;
    int q=7;
    System.out.println(i<=j);//In 2 conditions (If any one condition is satisfied it returns true else false)
    System.out.println(i>=j);
    System.out.println("---------------------------");
    System.out.println("Logical Operator");
    int x=5;
    int y=7;
    System.out.println(x>y && x==y); //(Both condition satisfy it returns True)
    System.out.println(x<y || x==y); //(Any one condition satisfy it returns True)
    System.out.println("---------------------------");
    System.out.println("Increment and Decrement Operator"); // Pre and Post Increment-increase the value by 1
    int v=7;
    System.out.println(v++);
    System.out.println(v); // The value will increment in next iteration not in the current iteration.
    System.out.println(++v);// The value will increment in current iteration itself.
    System.out.println(v--);
    System.out.println(v);
    System.out.println(--v);
    System.out.println("----------------");
    System.out.println("Interview Question");
    int m=6; //m++ + m-- - ++m 6+7-7=6
    System.out.println(m++);
    System.out.println(m);
    System.out.println(++m);
	}

}
