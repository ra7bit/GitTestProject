/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * IndexTest
 * 
 * $Id: IndexTest.java, v 1.0 Aug 13, 2012 9:43:07 AM$
 * 
 * Created on Aug 13, 2012
 * 
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.usermanagement.tests.bvt;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.usermanagement.UserManagementTest;

public class IndexTest extends UserManagementTest {

    @Test //TC_1268315
    public void testTabs() {
        indexPage.navigateToUserManagementIndexPage();
        indexPage.navigateToUsersPage();
        indexPage.navigateToGroupsPage();
        indexPage.navigateToReportSuitesPage();
        indexPage.navigateToPublishingListPage();
        indexPage.navigateToEmailPage();
        indexPage.navigateToHomePage();
    }

    @Test //TC_1268313
    public void testButtons() {
        indexPage.navigateToUserManagementIndexPage();
        indexPage.manageDiscoverUsersButton();
    }
}

