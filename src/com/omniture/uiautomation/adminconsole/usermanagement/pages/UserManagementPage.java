package com.omniture.uiautomation.adminconsole.usermanagement.pages;

import com.omniture.uiautomation.adminconsole.usermanagement.ui.UsersUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.util.dao.ScUser;

/**
 * @author ligyu
 */
public class UserManagementPage extends OmniturePage {
    String login = TestEnvironment.current.getUsername() ;
    public void navigateToUsersPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Permissions.GetLoginsUI"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        this.waitUntilPageLoad();
    }

    public void addNewUser(ScUser scUser) {
        navigateToUsersPage();
        this.click(UsersUI.ADDNEWUSER_LINK);
        this.waitUntilPageLoad();
        this.type(UsersUI.FIRSTNAME_INPUT, scUser.getFirstName());
        this.type(UsersUI.LASTNAME_INPUT, scUser.getLastName());
        this.type(UsersUI.EMAIL_INPUT, scUser.getEmail());
        this.type(UsersUI.LOGINNAME_INPUT, scUser.getLoginID());
        this.type(UsersUI.LOGINPASSWORD_INPUT, scUser.getPassword());
        this.type(UsersUI.CONFIRMPASSWORD_INPUT, scUser.getPassword());
        if (scUser.getIsAdmin()) {
            this.click(UsersUI.ADMINRADIO_INPUT);
        }
        this.selectByIndex(UsersUI.AVAILBEGROUP_SELECTOR, 0);
        this.click(UsersUI.ADDGROUP_BUTTON);
        this.click(UsersUI.SAVE_BUTTON);
    }

    public void editUser(ScUser scUser) {
        navigateToUsersPage();
        this.click(UsersUI.GetEditLinkByLoginID(scUser.getLoginID()));
        this.waitUntilPageLoad();
        this.clear(UsersUI.FIRSTNAME_INPUT);
        this.type(UsersUI.FIRSTNAME_INPUT, scUser.getFirstName());
        this.type(UsersUI.PHONE_INPUT, scUser.getPhone());
        this.selectByIndex(UsersUI.AVAILBEGROUP_SELECTOR, 0);
        this.click(UsersUI.ADDGROUP_BUTTON);
        this.click(UsersUI.SAVE_BUTTON);
    }

    public void removeUserByLoginID(ScUser scUser) {
        navigateToUsersPage();
        this.click(UsersUI.GetDeleteLinkByLoginID(scUser.getLoginID()));
        this.click(UsersUI.CONFIRMDELETE_LINK);
    }

    public void searchUser(ScUser scUser) {
        navigateToUsersPage();
        this.selectByValue(UsersUI.SEARCHTYPE_SECTOR, "login");
        this.type(UsersUI.SEARCHVALUE_INPUT, scUser.getLoginID());
        this.click(UsersUI.SEARCH_BUTTON);
        this.assertElementExists(UsersUI.GetDeleteLinkByLoginID(scUser.getLoginID()));

        this.click(UsersUI.CLEAR_BUTTON);
        this.selectByValue(UsersUI.SEARCHTYPE_SECTOR, "first_name");
        this.type(UsersUI.SEARCHVALUE_INPUT, scUser.getFirstName());
        this.click(UsersUI.SEARCH_BUTTON);
        this.assertElementExists(UsersUI.GetDeleteLinkByLoginID(scUser.getLoginID()));
    }

    public void sortByLogin() {        
        this.click(UsersUI.SORTBYLOGIN_LINK);
        this.assertElementExists(UsersUI.GetDeleteLinkByLoginID(login));
    }

    public void sortByFirstName() {
        navigateToUsersPage();
        this.click(UsersUI.SORTBYFIRSTNAME_LINK);
        this.assertElementExists(UsersUI.GetDeleteLinkByLoginID(login));
    }

    public void sortByAdmin() {
        this.click(UsersUI.SORTBYADMIN_LINK);
        this.assertElementExists(UsersUI.GetDeleteLinkByLoginID(login));
    }

    public void sortByLoginTime() {
        this.click(UsersUI.SORTBYLOGINTIME_LINK);
        this.assertElementExists(UsersUI.GetDeleteLinkByLoginID(login));
    }

    public void assertFailtoCreateUser() {
        assertErrorMessage("The password must contain at least 8 characters");
    }

    public void assertFailtoRemoveOwnUser() {
        assertErrorMessage("You cannot delete your own user.");
    }

    public void assertMissingRequiredField(String field) {
        assertErrorMessage(field + " is a required parameter.");
    }

    private void assertErrorMessage(final String error) {
        this.assertElementsTextContain(UsersUI.FLASHERROR_TEXT,
                error);
    }
}
