package Steps;

import Steps.Login;
import Steps.CreateLead;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;

	@BeforeMethod
	public void precondition() {
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}
	@AfterMethod	
	public void postcondition() {
		driver.close();
	}
}
