/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * IndexPage
 * 
 * $Id: IndexPage.java, v 1.0 Aug 13, 2012 9:43:35 AM$
 * 
 * Created on Aug 13, 2012
 * 
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.usermanagement.pages;

import com.omniture.uiautomation.adminconsole.usermanagement.ui.IndexUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

public class IndexPage extends OmniturePage {

    public void navigateToUserManagementIndexPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Permissions.Index"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        this.waitUntilPageLoad();
    }

    public void navigateToUsersPage() {
        this.click(IndexUI.USER_TAB);
        assertPageTitleShowCorrectly();
    }

    public void navigateToGroupsPage() {
        this.click(IndexUI.GROUP_TAB);
        assertPageTitleShowCorrectly();
    }

    public void navigateToReportSuitesPage() {
        this.click(IndexUI.REPORTSUITES_TAB);
        assertPageTitleShowCorrectly();
    }

    public void navigateToPublishingListPage() {
        this.click(IndexUI.PUBLISHINGLIST_TAB);
        assertPageTitleShowCorrectly();
    }

    public void navigateToEmailPage() {
        this.click(IndexUI.EMAIL_TAB);
        assertPageTitleShowCorrectly();
    }

    public void navigateToHomePage() {
        this.click(IndexUI.HOME_TAB);
        assertPageTitleShowCorrectly();
    }

    public void manageDiscoverUsersButton() {
        if (this.isElementExists(IndexUI.DISCOVER_BUTTON)){
            this.click(IndexUI.DISCOVER_BUTTON);
            this.assertElementsTextContain(IndexUI.PageTitle, "Active Discover Sessions");
        }
    }

    public void assertPageTitleShowCorrectly() {
        this.assertElementsTextContain(IndexUI.PageTitle, "User Management");
    }
}

