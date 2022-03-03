package week2.day2.class_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead_XpathAxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
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
		
		
		if(driver.findElement(By.xpath("//*[text()='Opentaps CRMSFA Login']")).isDisplayed())
		{
		//Opentaps CRMSFA Login
		//User name
		
		
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		//Password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//Click Login button
		driver.findElement(By.className("loginButton")).click();
		//Test Leaf Home page loaded
		}else System.out.println("//Opentaps CRMSFA Login does not exist");
		
		
		//Find Lead button click
		driver.findElement(By.linkText("Find Leads")).click();
		
		//$$$$$$$$$$
		//First Name: 
		driver.findElement(By.xpath("//label[contains(text(),'First name')]/following::input")).sendKeys("Test");
		//Click Find Leads
		driver.findElement(By.xpath("(//button[@class=\"x-btn-text\"])[7]")).click();
		//Select the lead id
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).click();
		
		//Edit the current lead
		driver.findElement(By.linkText("Edit")).click();
		// Clear the description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is really a good practice");
		//Click update button
		driver.findElement(By.xpath("//input[@value ='Update'] ")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
