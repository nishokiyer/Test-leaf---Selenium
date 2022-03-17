package week4.day1.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// 2. Enter UserName and Password Using Id Locator
		//Login page Navigation steps
		//User name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//* 3. Click on Login Button using Class Locator
		//Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Logged in successfully");
		//4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("TestLeaf Home page loaded successfully");
		
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("http://leaftaps.com/crmsfa/control/main"))	{
			driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
		}
		//5. Click on contacts Button
		//Click Contacts		
		driver.findElement(By.linkText("Contacts")).click();
		
		//6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		String Main_Window = driver.getWindowHandle();
		// 7. Click on Widget of From Contact
		driver.findElement(By.xpath("//form[@name ='MergePartyForm']/table/tbody/tr/td[2]/a")).click();
		//Window handels
		for(String Contacts_window : driver.getWindowHandles()){
		    driver.switchTo().window(Contacts_window);
		}
		
		
		// 8. Click on First Resulting Contact
		driver.findElement(By.xpath("//div[1]/table/tbody/tr/td/div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(Main_Window);
		//9. Click on Widget of To Contact
		driver.findElement(By.xpath("//form[@name ='MergePartyForm']/table/tbody/tr[2]/td[2]/a")).click();
		for(String Contacts_window : driver.getWindowHandles()){
		    driver.switchTo().window(Contacts_window);
		}
		
		//10. Click on Second Resulting Contact
		driver.findElement(By.xpath("//div[2]/table/tbody/tr/td/div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(Main_Window);
		// 11. Click on Merge button using Xpath Locator
		driver.findElement(By.linkText("Merge")).click();
		
		//12. Accept the Alert * 
		driver.switchTo().alert().accept();
		//13. Verify the title of the page
		//System.out.println(driver.getTitle());
		
		if(driver.getTitle().contains("View Contact | opentaps CRM")) {
			System.out.println("Title Verified and Test case passed");
		}else {
			System.out.println("Title not same and Test case failed");
		}
	}

}
