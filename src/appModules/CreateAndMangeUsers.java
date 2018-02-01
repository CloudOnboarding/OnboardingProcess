package appModules;
 
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.CreateAndManageUser_Page;
import pageObjects.Message_Handler;
import utility.OnboardingConstants;
import utility.psUtility;

public class CreateAndMangeUsers extends psUtility {
	@Test
	public static void Execute() throws Exception {

		CreateAndManageUser_Page.btn_AddNewUser().click();
		CreateAndManageUser_Page.txt_InviteTuFirstName().sendKeys("Kathy");
		CreateAndManageUser_Page.txt_InviteTuLastName().sendKeys("Burke");
		CreateAndManageUser_Page.txt_InviteTuEmail().sendKeys("Demo@smarterp.com");
		CreateAndManageUser_Page.txt_InviteTuPhone().sendKeys("9999999999");
		select(CreateAndManageUser_Page.select_InviteTuSmartOnbRolesDefault(), "HR Specialist");
		CreateAndManageUser_Page.btn_Add().click();
		select(CreateAndManageUser_Page.select_InviteTuSmartOnbRoles(), "Recruiter");
		CreateAndManageUser_Page.btn_Add().click();
		select(CreateAndManageUser_Page.select_InviteTuSmartOnbRoles(), "Help Desk Analyst");
		CreateAndManageUser_Page.btn_Add().click();
		select(CreateAndManageUser_Page.select_InviteTuSmartOnbRoles(), "I-9 Specialist");
		CreateAndManageUser_Page.btn_Add().click();
		select(CreateAndManageUser_Page.select_InviteTuSmartOnbRoles(), "E-Verify Specialist");
		CreateAndManageUser_Page.btn_Add().click();
		select(CreateAndManageUser_Page.select_InviteTuSmartOnbRoles(), "Process Administrator");
		CreateAndManageUser_Page.btn_InviteTuSave().click();
		CreateAndManageUser_Page.btn_InviteTuLaunch().click();

		String EmailLaunch = Message_Handler.get_ModalBodyText().getText();
		Message_Handler.btn_ModalBodyClose().click();
		Reporter.log(EmailLaunch + "<br>");
		// Tenant User Id generation
		OnboardingConstants.TUUser = "TU_" + OnboardingConstants.OrgId;
		// Constant.OnboardingUser = OnboardingConstants.TUUser;
		System.out.println("Tenant User id Assigned ::" + OnboardingConstants.TUUser);

	}
}
