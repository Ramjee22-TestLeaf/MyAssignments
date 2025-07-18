package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFunction {

	public static void main(String[] args) 
	{
		//Launch Edge Browser
		EdgeDriver driver=new EdgeDriver();
		//Load URL
		driver.get("https://www.facebook.com/");
		//Maximize the window
		driver.manage().window().maximize();
       
		//First we need to find the Web element
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
