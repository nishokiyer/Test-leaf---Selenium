package week2.day1.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_CreateLead {

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
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
