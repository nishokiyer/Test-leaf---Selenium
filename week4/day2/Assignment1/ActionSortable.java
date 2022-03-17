package week4.day2.Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement l1 = driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
		WebElement l3 = driver.findElement(By.xpath("//*[@id='sortable']/li[3]"));
		WebElement l5 = driver.findElement(By.xpath("//*[@id='sortable']/li[5]"));
		
		Actions action = new Actions(driver);
		action
		.dragAndDrop(l1, l3)
		.dragAndDrop(l3, l5)
		.dragAndDrop(l5, l1)
		.perform();
	}

}
