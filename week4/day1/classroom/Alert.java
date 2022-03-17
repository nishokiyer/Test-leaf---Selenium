package week4.day1.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//No Alert Exception - Before clicking alert msg try to provide alert accept exception is thrown
		//driver.switchTo().alert().accept();
		
		//Alert box
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		driver.switchTo().alert().accept();
		System.out.println("Handeled Alert message");
		//Confirm Box
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("Confirm Box dismissed");
		//Prompt box
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		driver.switchTo().alert().sendKeys("Nishokiyer");
		System.out.println("Prompt box handled with sendkeys");
		//unhandeled Alert exception - uncomment below 3 lines
		//driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//System.out.println(driver.getTitle());
		
	}

}
