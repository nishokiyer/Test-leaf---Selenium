package Com.Testleaf.UI.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificationMethod;

public class WelcomePage extends ProjectSpecificationMethod {
	public WelcomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public HomePage CRM_SFA(){
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("TestLeaf Home page loaded successfully");
		return new HomePage(driver);
	}
	
}
