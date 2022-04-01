package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenition {
	public ChromeDriver driver;
	@Given("A chrome browser is lanched")
	public void a_chrome_browser_is_lanched() {
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver(); 
	    
	}
	@And("Load Leaf taps URL {string}")
	public void load_leaf_taps_url(String url) {
		driver.get(url);
	}
	@And("Maximize the browser")
	public void maximize_the_browser() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Given("valid username {string}")
	public void valid_username(String username) {		//User name
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Valid password {string}")
	public void valid_password(String password) {
		//Password
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("login button clicked")
	public void login_button_clicked() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	@Then("new window gets loaded")
	public void new_window_gets_loaded() {
		System.out.println("Logged in successfully");
	}
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
	//Delete Lead

@When("Delete button clicked")
public void delete_button_clicked() {
	WebElement firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[1]/table/tbody/tr[1]/td[1]/div/a"));
	String FL = firstLead.getText();
	firstLead.click();
	System.out.println(FL);
	// Click Delete
	driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	
}

	//Close browser 
	@Then("Close the browser")
	public void close_the_driver() {
	    driver.close();
	}
}
