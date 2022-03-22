package week5.day1.Assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day1.Assignment1.BaseClass;

public class ServiceNow_AssignTheInstance_Assignment extends BaseClass {
	//@Test(dependsOnMethods = {"createinstance()"})

	//public String incident_num = "INC0008111";
	@Test(dependsOnMethods = "ServiceNow_CreateInstance_Assignment.createinstance.updateinstance", alwaysRun=true)
	public void AssignTheInstance() {
	//driver.get("https://dev85046.service-now.com/navpage.do");
	//WebElement Frame = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
	//driver.switchTo().frame((Frame));*/
	//Login Screen
	//User Name
	driver.findElement(By.id("user_name")).sendKeys("admin");
	//Password
	driver.findElement(By.id("user_password")).sendKeys("Dheera@123");
	//Login button
	driver.findElement(By.id("sysverb_login")).click();
	//Step5: Search “incident“ Filter Navigator*/
	driver.findElement(By.id("filter")).sendKeys("incident");
	driver.findElement(By.xpath("//div[text()='Incidents']")).click();
	//iframe
	WebElement Frame2 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
	driver.switchTo().frame((Frame2));
	
	System.out.println(incident_num);
	//Search for the incident
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/span/div/div[1]/div/span/div/div/input")).sendKeys(incident_num,Keys.ENTER);
	System.out.println(incident_num + " Incident identified sucessfully");
	driver.findElement(By.xpath("//*[text()='"+incident_num+"']")).click();
	//Click Delete Button
	driver.findElement(By.xpath("//button[@id ='sysverb_delete']")).click();
	System.out.println("Clicking Delete Incident button");
	driver.findElement(By.xpath("//button[@id='ok_button']")).click();
	System.out.println("Confirm delete");
	}
}
