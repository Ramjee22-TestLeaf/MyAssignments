package week3.day3;

public class JavaConnection implements DatabaseConnection
{
    public void connect()
    {
    	System.out.println("Database connected");
    	
    }
    public void disconnect()
    {
    	System.out.println("Database disconnected");
    	
    }
    public void executeUpdate()
    {
    	System.out.println("Updated Database");
    	
    }
	public static void main(String[] args) 
	{
		JavaConnection DB=new JavaConnection();
		DB.connect();
		DB.disconnect();
		DB.executeUpdate();

	}

}
