package Com.Testleaf.UI.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod{
	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public ViewLeadPage Verify_Lead() {
		String Lead_id = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(Lead_id);
		System.out.println(driver.getTitle());
		return this;
	}
	public EditLeadPage Click_Edit_Lead() {
		
		driver.findElement(By.linkText("Edit")).click();
		System.out.println("Edit Lead page loaded successfully");
		return new EditLeadPage(driver);
		}
	public ViewLeadPage Lead_id() {
		String Lead_id = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(Lead_id);
		return this;
	}
	public DuplicateLeadPage Click_Duplicate_Lead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}
	public CreateLeadPage click_Create_Lead() {
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("Create Lead page loaded successfully");
		return new CreateLeadPage(driver);
	}

	public ViewLeadPage VerifyDeleteLead() {
		WebElement firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[1]/table/tbody/tr[1]/td[1]/div/a"));
		String FL = firstLead.getText();
		firstLead.click();
		System.out.println(FL);
		// Click Delete
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
			
		return this;
		
	
	
		}
}