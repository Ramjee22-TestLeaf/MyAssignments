package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CollectBasedXpath {

	public static void main(String[] args) 
	{

EdgeDriver driver=new EdgeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Men");
//Thread.sleep(5000);
driver.close();

	}

}
