/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * AdminConsoleTest
 *
 * $Id: AdminConsoleTest.java, v 1.0 Aug 24, 2012 5:06:45 PM$
 *
 * Created on Aug 24, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.logs.test.bvt;

import org.junit.Test;
import com.omniture.uiautomation.adminconsole.logs.Logs;
import com.omniture.uiautomation.adminconsole.usermanagement.pages.GroupManagementPage;
import com.omniture.uiautomation.pages.OmniturePage;

public class AdminConsoleTest extends Logs {
	
    @Test //TC_1267871
    public void testLogPages() {
        adminConsoleLogPage.navigateToAdminConsoleLogPage();
        adminConsoleLogPage.navigateToUsageAccessLogPage();
        adminConsoleLogPage.navigateToReportSuiteChangeLogPage();
        adminConsoleLogPage.navigateToAdminConsoleLogPageByClick();
        adminConsoleLogPage.goToPageTwoInAdminConsoleLogPage();
    }
    
    @Test //TC_1267869
    public void testSearch() {
        adminConsoleLogPage.navigateToAdminConsoleLogPage();
        adminConsoleLogPage.searchInAdminConsoleLogPage();
    }
    
    @Test //TC_1297133
    public void testSort() {
        adminConsoleLogPage.sortByEventType();
        adminConsoleLogPage.sortByLogin();
    }
}

