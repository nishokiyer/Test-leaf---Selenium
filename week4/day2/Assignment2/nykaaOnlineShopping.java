package week4.day2.Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nykaaOnlineShopping {

	public static void main (String args[])throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Variable declaration area
		driver.findElement(By.name("search-suggestions-nykaa")).click();
		driver.findElement(By.name("search-suggestions-nykaa")).sendKeys("L'Oreal Paris",Keys.ENTER);
		driver.findElement(By.cssSelector("#filter-sort > div > div > button > svg")).click();
		driver.findElement(By.xpath("//div[@id='filter-sort']/div/div/ul/div[4]/label/div[2]")).click();
		driver.findElement(By.cssSelector("#first-filter > div > div > div > svg")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@id='custom-scroll']/ul/li/ul/li[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='custom-scroll']/ul/li/ul/li/ul/li[1]/div/label/div[2]")).click();
		
		/*WebElement brand = driver.findElement(By.xpath("//*[@id=\"headerMenu\"]/div[1]/ul[2]/li/a"));
		WebElement brandlink = driver.findElement(By.xpath("https://www.nykaa.com/"));
		WebElement spyglass = driver.findElement(By.xpath("//*[@id='headerMenu']/div[1]/ul[2]/li/ul/li/section[1]/div[1]/div/div"));
		
		Actions action = new Actions(driver);
		action
		.moveToElement(brand).click()
		.moveToElement(search).sendKeys("L'Oreal Paris")
		.moveToElement(spyglass).click()
		.perform();*/
		
		
	}

}
