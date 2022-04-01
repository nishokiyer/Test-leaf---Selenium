package Steps;

import Steps.Login;
import Steps.CreateLead;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DuplicateLead extends BaseClass{
	//Duplicate id creation 
		@Given("Click the Duplicate Lead link")
		public void click_the_duplicate_lead_link() {
			driver.findElement(By.linkText("Duplicate Lead")).click();
		}
		@Given("Clear the current company name field")
		public void clear_the_current_company_name_field() {
			driver.findElement(By.id("createLeadForm_companyName")).clear();
		}
		@Given("update new company name {string}")
		public void update_new_company_name(String stnew_companyname) {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(stnew_companyname);
		}
		@Given("Clear first name")
		public void clear_first_name() {
			driver.findElement(By.id("createLeadForm_firstName")).clear();
		}
		@Given("update new first name {string}")
		public void update_new_first_name(String updated_first_name) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(updated_first_name);
		}
		@Then("Duplicate Lead number gets generated successfully")
		public void duplicate_lead_number_gets_generated_successfully() {
			System.out.println("Duplicate Lead created successfully");
			String Dup_Lead_id = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			System.out.println(Dup_Lead_id);
			String Lead_id = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			if(Lead_id!=Dup_Lead_id)
			System.out.println(Lead_id +" and " + Dup_Lead_id + "is not similar.");
			else System.out.println(Lead_id +" and " + Dup_Lead_id + "is similar.");
		}
		
	}
