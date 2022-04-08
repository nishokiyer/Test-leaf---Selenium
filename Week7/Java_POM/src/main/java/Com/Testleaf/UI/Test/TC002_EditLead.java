package Com.Testleaf.UI.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Com.Testleaf.UI.Page.LoginPage;
import base.ProjectSpecificationMethod;

public class TC002_EditLead extends ProjectSpecificationMethod{
	
@BeforeTest
public void setData() {
	excelFilePath = "Test_Data.xlsx";
	sheetname = "Edit_Lead";
}

@Test(dataProvider = "fetchData")
public void Run_EditLead(String username, String password, String companyname, String firstname, String lastname, String fullname, String dept, String Comment, String email) {
 new LoginPage(driver)
 	.EnterUserName(username)
 	.EnterPassword(password)
 	.ClickLoginbutton_positive()
 .CRM_SFA()
 .click_Lead()
 .click_Create_Lead()
 	.companyname(companyname)
 	.firstname(firstname)
 	.lastname(lastname)
 	.fullname(fullname)
 	.dept(dept)
 	.comment(Comment)
 	.email(email)
 	.state()
 	.Click_Create_Leadbutton()
 .Verify_Lead()
 	.Lead_id()
.Click_Edit_Lead()
 	.clear_desc()
 	.fill_note()
 	.click_update_button();
 	
 

}

}