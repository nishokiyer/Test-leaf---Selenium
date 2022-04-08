package Com.Testleaf.UI.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Com.Testleaf.UI.Page.LoginPage;
import base.ProjectSpecificationMethod;

public class TC004_DeleteLead extends ProjectSpecificationMethod{
	
@BeforeTest
public void setData() {
	excelFilePath = "Test_Data.xlsx";
	sheetname = "Delete_Lead";
}

@Test(dataProvider = "fetchData")
public void Run_DeleteLead(String username, String password) {
 new LoginPage(driver)
 	.EnterUserName(username)
 	.EnterPassword(password)
 	.ClickLoginbutton_positive()
 .CRM_SFA()
  .click_Lead()
 .VerifyDeleteLead();
}

}