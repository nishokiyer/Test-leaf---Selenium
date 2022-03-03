package week2.day2.Assignment4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
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
	driver.findElement(By.xpath("//button[@id='home']")).click();
	System.out.println("Navigated to Home Page");
	driver.navigate().back();
	System.out.println("Back to button page itself");
	//Find position of button (x,y)
	Point Pos = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
	System.out.println("X value is " +Pos.getX() +" and Y value is " + Pos.getX());
	//Find button color
	String Col = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
	System.out.println(Col);
	//What is my size
	WebElement Mysize = driver.findElement(By.xpath("//button[@id='size']"));
	System.out.println("What is my size");
	System.out.println("My size button height is " + Mysize.getSize().height);
	System.out.println("My size button width is "+Mysize.getSize().width);
	System.out.println("Button Assignment completed");
	driver.close();

	}

}
