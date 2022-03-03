package week2.day2.class_assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Button_Assignment4 {
	{
	WebDriverManager.chromedriver().setup(); 
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("http://leafground.com/pages/Button.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Go to Home Page
	driver.findElement(By.xpath("//*[text()='Go to Home Page'")).click();
	driver.navigate().back();
	//Find position of button (x,y)
	
	}

}
