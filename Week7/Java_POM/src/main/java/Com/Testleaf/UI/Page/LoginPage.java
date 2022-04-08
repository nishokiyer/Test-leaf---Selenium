package Com.Testleaf.UI.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod{
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public LoginPage EnterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		//LoginPage page = new LoginPage();
		//return page;
		//return new LoginPage();
		return this;
	}
	public LoginPage EnterPassword(String password) {
		//Password
	driver.findElement(By.id("password")).sendKeys(password);
	return this;			
	}
	public WelcomePage ClickLoginbutton_positive() {
		//Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	public LoginPage ClickLoginbutton_negative() {
		//Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
	

}
