package com.omniture.uiautomation.adminconsole.usermanagement.pages;

import com.omniture.uiautomation.adminconsole.usermanagement.ui.GroupsUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

/**
 * @author ligyu
 */

public class GroupManagementPage extends OmniturePage {

    private String groupName = "SCAutoTest_GroupTest";
    private String groupDesc = "SCAutoTest_Desc";
    private String login = TestEnvironment.current.getUsername();

    public void navigateToGroupsPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Permissions.GetGroupsUI"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        this.waitUntilPageLoad();
    }

	public void addNewGroup() {
		navigateToGroupsPage();
		this.click(GroupsUI.ADDNEWGROUP_LINK);
		this.waitUntilPageLoad();
		this.type(GroupsUI.GROUPNAME_INPUT, groupName);
		this.type(GroupsUI.GROUPDESCRIPTION_INPUT, groupDesc);
		this.click(GroupsUI.SAVE_BUTTON);
		this.assertElementsTextContain(GroupsUI.FLASHMESSAGE_TEXT, "has been created");
	}

	public void editGroup() {
		navigateToGroupsPage();
		this.click(GroupsUI.GetEditLinkByGroupName(groupName));
		this.waitUntilElement(GroupsUI.SAVE_BUTTON);
		this.selectByIndex(GroupsUI.AVAILABLEREPORTSUITES, 0);
		this.click(GroupsUI.ADD_BUTTON);
		this.click(GroupsUI.CONVERSIONREPORTACCESS_RADIO);
		this.click(GroupsUI.TRAFFICREPORTACCESS_RADIO);
		this.type(GroupsUI.SEARCHAVAILUSERS_INPUT, login);
		this.click(GroupsUI.SEARCH_BUTTON);
		this.selectByIndex(GroupsUI.AVAILABLEUSERS_SELECTOR, 0);
		this.click(GroupsUI.ADDUSER_BUTTON);
		this.click(GroupsUI.SAVE_BUTTON);
		this.assertElementsTextContain(GroupsUI.FLASHMESSAGE_TEXT, "has been updated");
	}

    public void editPreBuiltGroup() {
        navigateToGroupsPage();
        this.click(GroupsUI.GetEditLinkByGroupName("All Report Access"));
        this.waitUntilElement(GroupsUI.SAVE_BUTTON);
        tryToRemoveUserFromGroup();
        this.type(GroupsUI.SEARCHAVAILUSERS_INPUT, login);
        this.click(GroupsUI.SEARCH_BUTTON);
        this.selectByIndex(GroupsUI.AVAILABLEUSERS_SELECTOR, 0);
        this.click(GroupsUI.ADDUSER_BUTTON);
        this.click(GroupsUI.SAVE_BUTTON);
        this.assertElementsTextContain(GroupsUI.FLASHMESSAGE_TEXT, "has been updated");
    }

    private void tryToRemoveUserFromGroup() {
        try {
            this.type(GroupsUI.SEARCHSELECTEDUSERS_INPUT, login);
            this.click(GroupsUI.SELECTEDSEARCH_BUTTON);
            this.selectByIndex(GroupsUI.SELECTEDUSERS_SELECTOR, 0);
            this.click(GroupsUI.REMOVE_BUTTON);
        }
        catch (Exception e){}

    }

    public void searchGroup() {
        this.selectByValue(GroupsUI.SEARCH_SECTOR, "name");
        this.type(GroupsUI.SEARCH_INPUT, groupName);
        this.click(GroupsUI.GO_BUTTON);
        this.assertElementExists(GroupsUI.GetDeleteLinkByGroupName(groupName));
        this.selectByValue(GroupsUI.SEARCH_SECTOR, "description");
        this.clear(GroupsUI.SEARCH_INPUT);
        this.type(GroupsUI.SEARCH_INPUT, groupDesc);
        this.click(GroupsUI.GO_BUTTON);
        this.assertElementExists(GroupsUI.GetDeleteLinkByGroupName(groupName));
    }

	public void removeGroup() {
		navigateToGroupsPage();
		this.click(GroupsUI.GetDeleteLinkByGroupName(groupName));
		this.getLocator().alert().accept();
	}

}
