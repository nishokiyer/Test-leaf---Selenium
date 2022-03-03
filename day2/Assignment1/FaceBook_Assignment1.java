package week2.day2.Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook_Assignment1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Click Create New Account button
		driver.findElement(By.linkText("Create new account")).click();
		//First Name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dheera");
		//Last Name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nishok");
		//Mobile number or email
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Dheera.nishok@gmail.com");
		//Re-enter email
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Dheera.nishok@gmail.com");
				
		
		//Password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Dheera@123");
		//Birth day
		//Month
		Select Month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		Month.selectByIndex(6);
		//Day
		Select Day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		Day.selectByValue("9");
		//year
		Select Year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		Year.selectByVisibleText("2015");		
		//Gender - Female
		driver.findElement(By.xpath("//*[text() = 'Female']")).click();
		System.out.println("Form filled completely");
		driver.quit();
	}

}
