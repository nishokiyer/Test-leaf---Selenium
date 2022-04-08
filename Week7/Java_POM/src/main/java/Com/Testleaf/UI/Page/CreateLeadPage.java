package Com.Testleaf.UI.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificationMethod;

public class CreateLeadPage extends ProjectSpecificationMethod{
	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage companyname(String companyname) {
		//Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		return this;
	}
	public CreateLeadPage firstname(String firstname) {
		//First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
	}
	public CreateLeadPage lastname(String lastname) {
		//Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;
	}
	public CreateLeadPage fullname(String fullname) {
		//Full Name Local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fullname);
		return this;
	}
	public CreateLeadPage dept(String dept) {
		//Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dept);
		return this;
	}
	public CreateLeadPage comment(String Comment) {
		//Department
		driver.findElement(By.id("createLeadForm_description")).sendKeys(Comment);
		return this;
	}	
	public CreateLeadPage email(String email) {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
		
		return this;
	}	
	public CreateLeadPage state() {
		Select drop_select = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		drop_select.selectByVisibleText("New York");
		return this;
	}	
	public ViewLeadPage Click_Create_Leadbutton() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Lead created successfully");
		return new ViewLeadPage(driver);
	}
}
