package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	

	@When("click CRM\\/SFA link")
	public void click_crm_sfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Then("TestLeaf Home page loaded successfully")
	public void test_leaf_home_page_loaded_successfully() {
		System.out.println("TestLeaf Home page loaded successfully");
	}
	@Given("click Leads link")
	public void click_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Leads menu expands")
	public void leads_menu_expands() {
	    
	}
	@When("click create leads from left menu")
	public void click_create_leads_from_left_menu() {
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println("Create Lead page loaded successfully");

	}

@When("Fill the mandatory filed in the form {string} {string} {string} {string} {string} {string} {string} {string}")
public void fill_the_mandatory_filed_in_the_form(String Companyname, String first_name, String last_name, String fullname, String dept, String comment, String email, String state) {
	
		//Form Filling steps
				//Company Name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Companyname);
				//First Name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first_name);
				//Last Name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last_name);
				//First Name Local
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fullname);
				//Department
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dept);
				//Department
				driver.findElement(By.id("createLeadForm_description")).sendKeys(comment);
				//email id
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
				Select drop_select = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
				drop_select.selectByVisibleText(state);
	}
	@When("Submit button clicked")
	public void submit_button_clicked() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Lead created successfully");
	}
	@Then("New Lead number gets generated successfully")
	public void new_lead_number_gets_generated_successfully() {
		String Lead_id = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(Lead_id);
		System.out.println(driver.getTitle());
		
	}

}
