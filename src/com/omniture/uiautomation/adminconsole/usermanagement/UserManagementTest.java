package com.omniture.uiautomation.adminconsole.usermanagement;

import com.omniture.uiautomation.adminconsole.usermanagement.pages.GroupManagementPage;
import com.omniture.uiautomation.adminconsole.usermanagement.pages.IndexPage;
import com.omniture.uiautomation.adminconsole.usermanagement.pages.PublishingListPage;
import com.omniture.uiautomation.adminconsole.usermanagement.pages.ReportSuitesPage;
import com.omniture.uiautomation.adminconsole.usermanagement.pages.UserManagementPage;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * @author ligyu
 */

public class UserManagementTest extends OmnitureTest {

    protected UserManagementPage userManagement;
    protected GroupManagementPage groupManagement;
    protected ReportSuitesPage reportSuitesPage;
    protected IndexPage indexPage;
    protected PublishingListPage publishingListPage;

    public UserManagementTest()
    {
		this.userManagement = new UserManagementPage();
		this.groupManagement = new GroupManagementPage();
		this.reportSuitesPage = new ReportSuitesPage();
		this.indexPage = new IndexPage();
		this.publishingListPage = new PublishingListPage();
		
		
		this.userManagement.setWebDriver(this.webDriver);
		this.groupManagement.setWebDriver(this.webDriver);
		this.reportSuitesPage.setWebDriver(this.webDriver);
		this.indexPage.setWebDriver(this.webDriver);
		this.publishingListPage.setWebDriver(this.webDriver);
	}
}
