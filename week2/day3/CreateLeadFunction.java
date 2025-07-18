package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction 
{

	public static void main(String[] args) 
	{
		//Launch Edge Browser
				//EdgeDriver driver=new EdgeDriver();
				//Load URL
				//driver.get("https://www.facebook.com/");
				//Maximize the window
				//driver.manage().window().maximize();
		       
				//First we need to find the Web element
				//driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
				//driver.findElement(By.id("pass")).sendKeys("Tuna@321");
				//driver.findElement(By.name("login")).click();
		// Launch Edge Browser
		EdgeDriver driver = new EdgeDriver();

		// Load Url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Enter the username
		// findElement()
		// sendKeys
		
		//using xpath
		//driver.findElement(By.xpath("//input[@id='username")).sendKeys("Demosalesmanager");
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the CreateLead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		
		//Handling dropdown
		//Step1: Find the element
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		//Step2: Create an Object for Select Class
		Select options=new Select(sourceElement);
		
		//Step3: Use the method to select to Select the value
		options.selectByIndex(3);
		//options.selectByVisibleText("Finance");
		//options.selectByValue("IND_SOFTWARE");
		
		//Click on the Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		
		
}
		

}
