package week4.day1.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChercherTech_Frames_Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("/html/body/input")).sendKeys("Testing");
		System.out.println("Keyed the values");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		System.out.println("Check box checked");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
		Select animal = new Select(dropdown);
		animal.selectByVisibleText("Avatar");
		System.out.println("Avatar is selected");
		driver.close();
	}

}
