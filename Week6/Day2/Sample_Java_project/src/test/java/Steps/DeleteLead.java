package Steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
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
}