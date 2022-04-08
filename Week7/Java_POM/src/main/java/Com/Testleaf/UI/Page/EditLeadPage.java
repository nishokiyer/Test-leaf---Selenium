package Com.Testleaf.UI.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificationMethod;

public class EditLeadPage extends ProjectSpecificationMethod{

	public EditLeadPage(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public EditLeadPage clear_desc() {
		// Clear the description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		return this;
	}
	public EditLeadPage fill_note() {
		// Clear the description
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is really a good practice");
		return this;
	}
	public EditLeadPage click_update_button() {
		// Clear the description
		driver.findElement(By.xpath("//input[@value ='Update'] ")).click();
		System.out.println("Edited and updated successfully");
		System.out.println(driver.getTitle());
		return this;
	}
}
