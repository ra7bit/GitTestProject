/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * AdminConsoleLog
 *
 * $Id: AdminConsoleLog.java, v 1.0 Aug 24, 2012 4:36:52 PM$
 *
 * Created on Aug 24, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.logs;

import com.omniture.uiautomation.adminconsole.logs.pages.AdminConsoleLogPage;
import com.omniture.uiautomation.adminconsole.logs.pages.ReportSuiteChangePage;
import com.omniture.uiautomation.adminconsole.logs.pages.UsageAccessLogPage;
import com.omniture.uiautomation.tests.OmnitureTest;

public class Logs extends OmnitureTest {
    protected AdminConsoleLogPage adminConsoleLogPage;
    protected UsageAccessLogPage usageAccessLogPage;
    protected ReportSuiteChangePage reportSuiteChangePage;
    
    public Logs() {
        this.adminConsoleLogPage = new AdminConsoleLogPage();
        this.usageAccessLogPage = new UsageAccessLogPage();
        this.reportSuiteChangePage = new ReportSuiteChangePage();
        
        this.adminConsoleLogPage.setWebDriver(this.webDriver);
        this.usageAccessLogPage.setWebDriver(this.webDriver);
        this.reportSuiteChangePage.setWebDriver(this.webDriver);
    }
}

