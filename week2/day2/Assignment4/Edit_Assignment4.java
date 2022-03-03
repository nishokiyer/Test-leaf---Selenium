package week2.day2.Assignment4;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit_Assignment4 {
	{
	
	WebDriverManager.chromedriver().setup(); 
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("http://leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));

	//Enter your email address
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Nishok@rediffmail.com");
	//Append keys
	WebElement Test = driver.findElement(By.xpath("//input[@value='Append ']"));
	Test.sendKeys("Value");
	Test.sendKeys(Keys.TAB);
	Test.sendKeys("General text");

	driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	
	String Txtbox = driver.findElement(By.xpath("//*[text()='Confirm that edit field is disabled']/following::input")).getAttribute("disabled");
	System.out.println("Text box is disabled: " + Txtbox);
	System.out.println("Edit box Assignment completed");
	driver.close();

	}
}
