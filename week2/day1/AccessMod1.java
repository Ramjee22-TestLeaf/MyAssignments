package week2.day1;

public class AccessMod1 
{
	//Deposit and withdraw money
	//withdraw - account holder -private
	//deposit - anyone - public
	
	public void depositamount()// we can call from another class or package
	{
		System.out.println("amount deposited");
	}
	
	private void withdrawamount()// we can't call the method from another class or method since private
	{
		System.out.println("amount withdrawn");
	}

	public static void main(String[] args) 
	{
		AccessMod1 deposit=new AccessMod1();
		deposit.depositamount();
		deposit.withdrawamount();

	}

}
