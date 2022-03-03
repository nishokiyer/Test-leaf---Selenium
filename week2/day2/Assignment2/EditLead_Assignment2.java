package week2.day2.Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead_Assignment2 {

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
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("Create Lead page loaded successfully");

		//Form Filling steps
		//Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		//First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nishok");
		//Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Iyer");
		//First Name Local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nishok");
		//Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Administration");
		//Department
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Business administration to build your skills and advance your career. Learn business administration from top universities and institutions around the world");
		//email id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("First@simba.com");
		Select drop_select = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		drop_select.selectByVisibleText("New York");
		//Click "Create Lead" button
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Lead created successfully");
		String Lead_id = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(Lead_id);
		//Edit the current lead
		driver.findElement(By.linkText("Edit")).click();
		// Clear the description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is really a good practice");
		//Click update button
		System.out.println("Edited and updated successfully");
		driver.findElement(By.xpath("//input[@value ='Update'] ")).click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}