package week2.day2.Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact_Assignment2 {

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
		
		//Click Contacts		
		driver.findElement(By.linkText("Contacts")).click();
		System.out.println("Contact button clicked successfully");
		//Click Create Contacts
		driver.findElement(By.linkText("Create Contact")).click();
		System.out.println("Create Contacts page loaded successfully");

		//Form Filling steps
		//First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Nishok");
		//Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Iyer");
		//First Name Local
		//Click "Create Lead" button
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		System.out.println("Contacts  created successfully");
		String Contact_id = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println(Contact_id);
		System.out.println(driver.getTitle());
		driver.close();

	}

}
