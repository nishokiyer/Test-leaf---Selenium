package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{

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
}
