package week2.day2.Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Login page Navigation steps
		//User name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Logged in successfully");
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("TestLeaf Home page loaded successfully");
		
		
		/*if(driver.findElement(By.xpath("//*[text()='Opentaps CRMSFA Login']")).isDisplayed())
		{
		//Opentaps CRMSFA Login
		//User name
		
		
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		//Password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//Click Login button
		driver.findElement(By.className("loginButton")).click();
		//Test Leaf Home page loaded
		}else System.out.println("//Opentaps CRMSFA Login does not exist");*/
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//	Click First Resulting lead
		WebElement firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[1]/table/tbody/tr[1]/td[1]/div/a"));
		String FL = firstLead.getText();
		firstLead.click();
		System.out.println(FL);
		// Click Delete
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//Enter captured lead ID
		WebElement Leadid = driver.findElement(By.xpath("//input[@name='id']"));
		Leadid.sendKeys(FL);
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		WebElement Norec = driver.findElement(By.xpath("//div[text()='No records to display']"));
		
		if (Norec.isDisplayed())
		{
			System.out.println("Lead Record delected successfully");			
		}else System.out.println("Still the record is not deleted");
		//Close the browser (Do not log out)*/
		//driver.quit();

	}

}
