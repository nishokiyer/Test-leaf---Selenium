package week2.day1.class_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Basic {

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
			}
			
			
			driver.findElement(By.linkText("Create Lead")).click();
			System.out.println("Create Lead page loaded successfully");

			//Form Filling steps
			//Company Name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
			//First Name
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nishok");
			//Last Name
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Iyer");
			//Click "Create Lead" button
			driver.findElement(By.name("submitButton")).click();
			System.out.println("Lead created successfully");
			String Lead_id = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			System.out.println(Lead_id);
			driver.quit();
	}

}
