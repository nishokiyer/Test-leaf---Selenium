package week4.day2.class_Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.mk_latn.No;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrivingTableContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://erail.in/");
	        WebElement fromsta = driver.findElement(By.id("txtStationFrom"));
	        fromsta.clear();
	        fromsta.sendKeys("TPJ",Keys.TAB);
	        WebElement tostat = driver.findElement(By.id("txtStationTo"));
	        tostat.clear();
	        tostat.sendKeys("MS",Keys.TAB);
	 
		WebElement sortcheck = driver.findElement(By.id("chkSelectDateOnly"));
	        sortcheck.click();
	        //String trainname = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[1]/td[2]")).getText();
	        //System.out.println(trainname);
	        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
	        System.out.println(rows.size());//size of the row
	        //List<String>tain=new ArrayList<String>();
	        for (int i =1; i < rows.size(); i++) {
	            String alltrain = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
	            //System.out.println(alltrain);
	            if (alltrain .contains("CHENNAI")) {
	                System.out.println(alltrain);
	             
	            }
	            
	        }
		
		
	         
	}

}
