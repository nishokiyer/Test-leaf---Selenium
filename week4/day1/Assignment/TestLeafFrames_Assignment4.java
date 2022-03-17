package week4.day1.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafFrames_Assignment4 {

	public static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//iframe 1
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='Click']")).click();
		driver.switchTo().parentFrame();
		//Nested frame
		//driver.switchTo().frame(5);
		driver.switchTo().defaultContent();
		WebElement frame1 = driver.findElement(By.xpath("//div[@id='wrapframe'][2]/iframe"));
		driver.switchTo().frame(frame1);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//button[@id='Click1']")).click();
		driver.switchTo().defaultContent();
		
		List<WebElement> outerFrames = driver.findElements(By.tagName("iframe"));
		int size = outerFrames.size();
		System.out.println("No. of Outer count is : "+ size);
		for (int i = 0; i < size; i++) {
			driver.switchTo().frame(i);
			List<WebElement> innerFrame = driver.findElements(By.tagName("iframe"));
			count = count +innerFrame.size();
			driver.switchTo().defaultContent();
			
		}	
		
		System.out.println("No. of Inner frame count is : "+ count);
		
		
		driver.close();
	}

}
