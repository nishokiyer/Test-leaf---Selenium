package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{

	//Edit Lead code here
		@Given("Click the Edit Lead link")
		public void click_the_edit_lead_link() {
			driver.findElement(By.linkText("Edit")).click();
		}
		@Given("Clear the Decription field")
		public void clear_the_decription_field() {
			driver.findElement(By.id("updateLeadForm_description")).clear();
		}
		@Given("update new description details in the description field {string}")
		public void update_new_description_details_in_the_description_field(String Edit_desc) {
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(Edit_desc);
		}
		@When("Update button clicked")
		public void update_button_cliecked() {
			driver.findElement(By.xpath("//input[@value ='Update'] ")).click();
		}
		@Then("get the Title details")
		public void get_the_title_details() {
			System.out.println(driver.getTitle());
		}
}
