package com.omniture.uiautomation.adminconsole.company.pages;

import com.omniture.uiautomation.adminconsole.company.ui.SecurityUI;
import com.omniture.uiautomation.adminconsole.usermanagement.pages.UserManagementPage;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.util.dao.ScUser;

import org.junit.Assert;

/**
 * @author ligyu
 */

public class SecurityPage extends OmniturePage {

    public void navigateToSecurityManager() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Company.GetSecurity"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());	
		this.waitUntilPageLoad();
	}

	public void enableStrongPwd() {

		if (!this.findElement(SecurityUI.ENABLESTRONGPWD_CHECKBOX).isSelected()) {
			this.click(SecurityUI.ENABLESTRONGPWD_CHECKBOX);
			assertSettingUpdatedCorrectly();
		}
	}

   public void disableStrongPwd() {

        if (this.findElement(SecurityUI.ENABLESTRONGPWD_CHECKBOX).isSelected()) {
            this.click(SecurityUI.ENABLESTRONGPWD_CHECKBOX);
            assertSettingUpdatedCorrectly();
        }
    }

    public void disableEmailRestrictions() {
        if (this.findElement(SecurityUI.EMAILRESTRICTIONS_CHECKBOX).isSelected()) {
            this.click(SecurityUI.EMAILRESTRICTIONS_CHECKBOX);
        }
    }
	private void assertSettingUpdatedCorrectly(){
	    this.waitUntilElement(SecurityUI.FLASHMESSAGE_TEXT);
        this.assertElementTextContain(SecurityUI.FLASHMESSAGE_TEXT,
                "Security settings updated.");
	}

	public void assertFailToCreateUserWithoutStrongPwd() {
	    ScUser user = new ScUser();
	    user.setLoginID("SCAuto_AdminUser");
	    user.setPassword("111111");

		UserManagementPage userManagement = new UserManagementPage();
		userManagement.setWebDriver(this.webDriver);
		userManagement.addNewUser(user);
		userManagement.assertFailtoCreateUser();
	}

    public void enablePwdExpiration() {
        if (!this.findElement(SecurityUI.PWDEXPIRATION_CHECKBOX).isSelected()) {
            this.click(SecurityUI.PWDEXPIRATION_CHECKBOX);
        }
        this.waitUntilElement(SecurityUI.SAVE_BUTTON);
        this.clear(SecurityUI.INTERVAL_INPUT);
        this.type(SecurityUI.INTERVAL_INPUT, "1000");
        this.click(SecurityUI.SAVE_BUTTON);
        this.click(SecurityUI.BACK_BUTTON);
    }

    public void disablePwdExpiration() {
        if (this.findElement(SecurityUI.PWDEXPIRATION_CHECKBOX).isSelected()) {
            this.click(SecurityUI.PWDEXPIRATION_CHECKBOX);
        }
    }

    public void updatePwdExpirationIntervals() {
        this.click(SecurityUI.EDITPWDEXPIREINTERVAL_LINK);
        this.waitUntilElement(SecurityUI.SAVE_BUTTON);
        this.clear(SecurityUI.INTERVAL_INPUT);
        this.type(SecurityUI.INTERVAL_INPUT, "1000");
        this.click(SecurityUI.SAVE_BUTTON);
        this.click(SecurityUI.BACK_BUTTON);
    }

    public void assertPwdExpirationEnabled() {
        this.waitUntilElement(SecurityUI.PWDEXPIRATION_CHECKBOX);
        Assert.assertTrue("Password Expiration should be enabled.",
                this.findElement(SecurityUI.PWDEXPIRATION_CHECKBOX).isSelected());
    }

    public void assertEmailRestrictionsEnabled() {
        this.waitUntilElement(SecurityUI.EMAILRESTRICTIONS_CHECKBOX);
        Assert.assertTrue("Email Restrictions should be enabled.",
                this.findElement(SecurityUI.EMAILRESTRICTIONS_CHECKBOX).isSelected());
    }

    public void enableEmailRestrictions() {
        if (!this.findElement(SecurityUI.EMAILRESTRICTIONS_CHECKBOX).isSelected()) {
            this.click(SecurityUI.EMAILRESTRICTIONS_CHECKBOX);
        }
        this.waitUntilElement(SecurityUI.SAVEEMAIL_BUTTON);
        if (this.isElementExists(SecurityUI.DELETEENTRY_BUTTON)) {
            this.click(SecurityUI.DELETEENTRY_BUTTON);
        }
        this.clear(SecurityUI.ADDEMAIL_INPUT);
        this.type(SecurityUI.ADDEMAIL_INPUT, "adobe.com");
        this.clear(SecurityUI.ADDDESC_INPUT);
        this.type(SecurityUI.ADDDESC_INPUT, "everybody at adobe");
        this.click(SecurityUI.ADDSBMT_BUTTON);
        this.click(SecurityUI.SAVEEMAIL_BUTTON);
        this.click(SecurityUI.BACK_BUTTON);
    }

    public void enablePasswordRecoveryNotification() {
        String login = TestEnvironment.current.getUsername() ;
        if (!this.findElement(SecurityUI.PASSWORDRECOVERY_CHECKBOX).isSelected()) {
            this.click(SecurityUI.PASSWORDRECOVERY_CHECKBOX);
        }
        this.click(SecurityUI.EMAILNOTIFICATION_LINK);
        this.waitUntilElement(SecurityUI.SAVEEMAILNOTIFICATION_BUTTON);
        removeSelectUser(login);
        this.selectByVisibleText(SecurityUI.AVAILGROUPS_SELECT, login);
        this.click(SecurityUI.ADD_BUTTON);
        this.click(SecurityUI.SAVEEMAILNOTIFICATION_BUTTON);
        this.assertElementTextContain(SecurityUI.FLASHMESSAGE_TEXT, "Password recovery list has been updated");
    }

    private void removeSelectUser(String user) {
        try {
            this.selectByVisibleText(SecurityUI.SELECTEDGROUPS_SELECT, user);
            this.click(SecurityUI.REMOVE_BUTTON);
            this.click(SecurityUI.SAVEEMAILNOTIFICATION_BUTTON);
            this.assertElementTextContain(SecurityUI.FLASHMESSAGE_TEXT, "Password recovery list has been updated");
        }
        catch (Exception e) {

        }
    }
}
