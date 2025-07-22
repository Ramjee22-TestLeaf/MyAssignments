package week3.day3;

public class Amazon extends CanaraBank
{

	@Override
	public void cashonDelivery() 
	{
		System.out.println("1.Payment mode cash on delivery");
		
	}
	
	@Override
	public void upiPayments() 
	{
		System.out.println("2.Payment type UPI");
		
	}

	@Override
	public void cardPayments() 
	{
		System.out.println("3.Only card payments allowed");
		
	}

	@Override
	public void internetBanking() 
	{
		System.out.println("4.Login to Internet Banking");
		
	}

	
	
	public static void main(String[] args) 
	{
		Amazon payment=new Amazon();
		payment.recordPaymentDetails();
		payment.cashonDelivery();
		payment.upiPayments();
		payment.cardPayments();
		payment.internetBanking();
		
	}

}
