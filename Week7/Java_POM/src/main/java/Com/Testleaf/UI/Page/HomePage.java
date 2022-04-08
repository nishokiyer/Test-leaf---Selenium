package Com.Testleaf.UI.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod {
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public ViewLeadPage click_Lead() {
		driver.findElement(By.linkText("Leads")).click();
		return new ViewLeadPage(driver);
	}
	
	
}
