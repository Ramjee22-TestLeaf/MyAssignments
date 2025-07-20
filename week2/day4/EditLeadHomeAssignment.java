package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadHomeAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch Edgebrowser
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To get the URL of the page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//Text present on the element
		String text = driver.findElement(By.linkText("CRM/SFA")).getText();
		System.out.println(text);
		//To get the page source
		//String getpageSource = driver.getPageSource();
		//System.out.println(getpageSource);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ramjee");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("N");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ramjee");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium Java");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramjee@gmail.com");
		WebElement stateSelect =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(stateSelect);
		select.selectByVisibleText("Indiana");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement description=driver.findElement(By.id("updateLeadForm_description"));
		description.clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is an edited description");
		driver.findElement(By.className("smallSubmit")).click();
		//To get the Title of the page
		String titleOfPage = driver.getTitle();
		System.out.println("Title of the page"+titleOfPage);
		Thread.sleep(5000);
		//close the browser automatically (socket exception we can ignore)
		driver.close();
		
		
		
		//Thread.sleep to delay the time(replaced by explicit wait)
		//Thread.sleep(5000);
		
		
		
		
		
	}

}
