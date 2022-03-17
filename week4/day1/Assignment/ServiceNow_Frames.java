package week4.day1.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("https://dev85046.service-now.com/navpage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Frame = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame((Frame));
		//Login Screen
		//User Name
		driver.findElement(By.id("user_name")).sendKeys("admin");
		//Password
		driver.findElement(By.id("user_password")).sendKeys("Dheera@123");
		//Login button
		driver.findElement(By.id("sysverb_login")).click();
		//Step5: Search “incident“ Filter Navigator
		driver.findElement(By.id("filter")).sendKeys("incident");
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		//iframe
		WebElement Frame2 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame((Frame2));
		//Step6: Click “All”
		
		driver.findElement(By.xpath("//*[@id='incident_breadcrumb']/a[1]/b")).click();
		//Step7: Click New button
		driver.findElement(By.xpath("//*[@id='sysverb_new']")).click();
		//incident number
		String incident_num = driver.findElement(By.xpath("//*[@id='incident.number']")).getAttribute("value");
		
		//Step8: Select a value for Caller and Enter value for short_description
		driver.findElement(By.xpath("//*[@id='sys_display.incident.caller_id']")).sendKeys("Ted Bozelle",Keys.TAB);
		driver.findElement(By.xpath("//*[@id='incident.short_description']")).sendKeys("TestLeaf dec=scription",Keys.TAB);
		driver.findElement(By.xpath("//*[@id='incident.comments']")).sendKeys("Test",Keys.TAB);
		//Step10: Click on Submit button
		driver.findElement(By.xpath("//*[@id='sysverb_insert_bottom']")).click();
		//Search for the incident
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/span/div/div[1]/div/span/div/div/input")).sendKeys(incident_num,Keys.ENTER);
		System.out.println(incident_num + " created sucessfully");
		

	}

}
