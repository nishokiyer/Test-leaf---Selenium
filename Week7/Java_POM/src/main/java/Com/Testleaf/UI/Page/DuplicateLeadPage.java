package Com.Testleaf.UI.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificationMethod;

public class DuplicateLeadPage extends ProjectSpecificationMethod{

	public DuplicateLeadPage(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public DuplicateLeadPage clear_companyname() {
		//Company Name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		return this;
	}
	public DuplicateLeadPage companyname() {
		//Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MPower");
		return this;
	}
	public DuplicateLeadPage clear_first_name() {
		// Clear the description
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		return this;
	}
	public DuplicateLeadPage update_first_name() {
		// Clear the description
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Padhmapriyaa");
		return this;
	}
	
	public DuplicateLeadPage Click_Duplicate_Lead_button() {
		// Clear the description
		driver.findElement(By.name("submitButton")).click();
		//Duplicate Lead created successfully
		System.out.println("Duplicate Lead created successfully");
		return this;
	}
	
	
	
	


			
			
			
	
	
}
