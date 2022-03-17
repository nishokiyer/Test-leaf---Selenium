package week4.day2.Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSelectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement l1 = driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
		WebElement l3 = driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
		WebElement l5 = driver.findElement(By.xpath("//*[@id='selectable']/li[5]"));
		
		Actions action = new Actions(driver);
		action
		.sendKeys(Keys.CONTROL)
		.sendKeys(Keys.DOWN)
		.clickAndHold()
		.click(l1)
		.click(l3)
		.click(l5)
		.sendKeys(Keys.UP)
		.release()
		.perform();
	}

}
