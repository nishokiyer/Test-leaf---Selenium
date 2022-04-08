package base;

import java.io.IOException;
import java.rmi.Remote;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificationMethod {
	public RemoteWebDriver driver;
	public String excelFilePath; 
	public String sheetname;
	//@Parameters({"URL","BROWSER_NAME"})
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(excelFilePath, sheetname);
	}

}
