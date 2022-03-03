package week2.day2.Assignment4;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Assignment4 {
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement Skilldrop1 = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(Skilldrop1);
		String firstSelect = drop1.getFirstSelectedOption().getText();
		System.out.println(firstSelect);
		//Alternative way to Select option
		WebElement Skilldrop2 = driver.findElement(By.name("dropdown2"));
		Skilldrop2.sendKeys("Selenium");
		
		WebElement Skilldrop3 = driver.findElement(By.name("dropdown3"));
		Select Sk3 = new Select(Skilldrop3);
		Sk3.selectByValue("2");
		
		WebElement Skilldrop4 = driver.findElement(By.className("dropdown"));
		Select Sk4 = new Select(Skilldrop4);
		List<WebElement> options = Sk4.getOptions();
		System.out.println(options.size());
		
		driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("UFT/QTP");
		
		//Listbox selection using Select class
		WebElement Listbox = driver.findElement(By.xpath("//div[@class = 'example'][6]/select"));
		Select Listdrop = new Select(Listbox);
		Listdrop.selectByValue("2");
		Listdrop.selectByValue("4");
		Listdrop.deselectAll();
		System.out.println("Drop down Assignment completed");
		driver.close();
		
		
	}
}
