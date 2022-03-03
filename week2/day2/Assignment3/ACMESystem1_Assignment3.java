package week2.day2.Assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMESystem1_Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Email id login
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		//Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		//Login
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		//Get page title
		System.out.println("Page title is : " + driver.getTitle());
		//Log out
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();

	}

}
