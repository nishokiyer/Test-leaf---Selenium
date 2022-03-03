package week2.day2.Assignment4;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.mk_latn.No;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Link_Assignment4 {
	{
	WebDriverManager.chromedriver().setup(); 
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("http://leafground.com/pages/Link.html");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//Go to Home Page
	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/a")).click();
	driver.navigate().back();
	//Find where am supposed to go without clicking me?
	String geturl = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/a")).getAttribute("href");
	System.out.println(geturl);
	//Verify am I broken?
	String Errurl = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/a")).getAttribute("href");
	System.out.println(Errurl);
	if(Errurl.contains("error"))
		System.out.println("Link points to broken URL");
	//Go to Home Page (Interact with same link name)
	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/a")).click();
	System.out.println("Go to Home Page (Interact with same link name)");
	driver.navigate().back();
	//How many links are available in this page?

	List<WebElement> Countlink = driver.findElements(By.xpath("//div[@id='contentblock']/section/div/div/div/a"));
	System.out.println("No. of links:"+Countlink.size());
	System.out.println("List box Assignment completed");
	driver.close();
	}

}
